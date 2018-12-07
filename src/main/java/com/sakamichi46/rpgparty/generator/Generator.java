package com.sakamichi46.rpgparty.generator;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import java.util.List;
import java.util.stream.IntStream;

import com.sakamichi46.rpgparty.model.Member;
import com.sakamichi46.rpgparty.model.PartyMember;
import com.sakamichi46.rpgparty.prop.CloudinaryProperties;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Map;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import java.util.concurrent.atomic.*;

public class Generator {
    
    private final List<Member> memberList;
    private final List<Member> generatorMemberList;
    private final List<PartyMember> partyMemberList;
    private final List<String> jobsList;
    private final List<BufferedImage> imageList;
    
    @Autowired
    private CloudinaryProperties cloudinaryProp;
    
    public Generator(List<Member> memberList, List<String> jobsList, List<BufferedImage> imageList) {
        this.memberList = memberList;
        this.jobsList = jobsList;
        this.imageList = imageList;
        generatorMemberList = new ArrayList<>();
        partyMemberList = new ArrayList<>();
        createGeneratorMap();
    }

    private void createGeneratorMap() {
        if(memberList != null && memberList.size() > 0) {
            memberList.stream().forEach(member -> {
                IntStream.range(0, member.getWeight()).forEach(num -> {
                    generatorMemberList.add(new PartyMember(member));
                });
            });
        }
    }
    
    private String getHashedHex(String name) {
        StringBuilder sb = new StringBuilder();
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            md.update(name.getBytes("UTF-8"));
            
            for(byte b: md.digest()) {
                sb.append(String.format("%02x",b )).toString();
            }
        } catch (NoSuchAlgorithmException | UnsupportedEncodingException ex) {
            Logger.getLogger(Generator.class.getName()).log(Level.SEVERE, null, ex);
        }
        return sb.toString();
    }
    
    private PartyMember generatePartyMember(String key, int cnt) {
        //16桁の文字列を16進数で合計した値をランダム値のシードに利用する
        int val = IntStream.range(0, key.length())
                .map(num ->  Character.getNumericValue(key.charAt(num)))
                .sum();
        Random random = new Random(val);
        Member member = generatorMemberList.get(random.nextInt(generatorMemberList.size()));
        PartyMember partyMember = new PartyMember();
        partyMember.setName(member.getName());
        partyMember.setNameHiragana(member.getNameHiragana());
        
        //jobはループのカウントに合わせて前から
        random = new Random(Character.getNumericValue(key.charAt(cnt)));
        String job = jobsList.get(random.nextInt(jobsList.size()));
        
        //画像はループのカウントに合わせて後ろから
        random = new Random(Character.getNumericValue(key.charAt(key.length() - 1 - cnt)));
        BufferedImage image = imageList.get(random.nextInt(imageList.size() - 1) + 1);
        
        partyMember.setJob(job);
        partyMember.setImage(image);

        return partyMember;
    }
    
    public String generate(String name) {
        //名前をハッシュ化して16進数の文字列(64文字)に変換して1人16文字の計4人分のデータをランダムで引く
        String hashedName = getHashedHex(name);
        List<String> keys = Arrays.asList(
                hashedName.substring(0, 16),
                hashedName.substring(16, 32),
                hashedName.substring(32, 48),
                hashedName.substring(48, 64)
                );
        
        //ユーザ
        PartyMember you = new PartyMember(name, name, "ゆうしゃ　　", imageList.get(0));
        partyMemberList.add(you);
        final AtomicInteger cnt = new AtomicInteger(0);
        keys.stream().forEach(k -> {
            PartyMember member = generatePartyMember(k, cnt.get());
            partyMemberList.add(member);
            generatorMemberList.removeIf(m -> m.getName().equals(member.getName()));
            cnt.addAndGet(1);
        });
        
        try {
            InputStream fontStream = new ClassPathResource("static\\font\\PixelMplus10-Regular.ttf").getInputStream();
            Font font = Font.createFont(Font.TRUETYPE_FONT, fontStream);
            Font fontBase = font.deriveFont(Font.PLAIN, 20);
            BufferedImage bufferedImage = new BufferedImage(600, 314, BufferedImage.TYPE_INT_RGB);
            Graphics graphics = bufferedImage.getGraphics();
            graphics.setColor(Color.BLACK);
            graphics.fillRect(0, 0, 600, 314);
            graphics.setColor(Color.WHITE);
            graphics.setFont(fontBase);

            for(int i = 0; i < partyMemberList.size(); i++) {
                PartyMember member = partyMemberList.get(i);
                int size = fontBase.getSize();
                BufferedImage nogiimge = member.getImage();
                if(nogiimge != null) {
                    graphics.drawImage(nogiimge, 0, nogiimge.getHeight() * i, null);
                    graphics.drawString(member.getJob() + "：" + partyMemberList.get(i).getNameHiragana(),
                    nogiimge.getWidth(), ((nogiimge.getHeight() * i)  + ((nogiimge.getHeight() - size) / 2) + size));
                } else {
                    graphics.drawString("まちがい", 0, 100);
                }
            }
       
            String url = null;
            if(cloudinaryProp.getOn().equals("true")) {
                File outputfile = new File(name + ".jpg");
                ImageIO.write(bufferedImage, "jpg", outputfile);
                Cloudinary cloudinary = new Cloudinary(ObjectUtils.asMap(
                    "cloud_name", cloudinaryProp.getCloudname(),
                    "api_key", cloudinaryProp.getApikey(),
                    "api_secret", cloudinaryProp.getApisecret())
                );
                
                String folderName = "SakamichiRpgParty";
                if(this instanceof KeyakizakaGenerator) {
                    folderName = "keyakizaka46";
                } else if(this instanceof HiraganaKeyakiGenerator) {
                    folderName = "hiraganakeyakizaka46";
                }

                Map upload = cloudinary.uploader().upload(outputfile,
                        ObjectUtils.asMap(
                                "public_id", name,
                                "folder", folderName,
                                "tags", partyMemberList.stream().filter(m -> !(m.getJob().startsWith("ゆうしゃ"))).map(m -> m.getNameHiragana()).toArray()));
                url = (String) upload.get("url");
            } else {
                ByteArrayOutputStream os = new ByteArrayOutputStream();
                ImageIO.write(bufferedImage, "jpg", os);
                url = "data:image/png;base64," + Base64.getEncoder().encodeToString(os.toByteArray());
            }
            return url;
        }   catch (IOException | FontFormatException ex) {
                Logger.getLogger(Generator.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}