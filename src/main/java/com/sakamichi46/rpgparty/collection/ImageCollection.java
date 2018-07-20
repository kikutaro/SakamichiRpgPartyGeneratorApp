package com.sakamichi46.rpgparty.collection;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import org.springframework.core.io.ClassPathResource;

public class ImageCollection {
    
    private static List<BufferedImage> nogizakaImages;
    private static List<BufferedImage> keyakizakaImages;
    private static List<BufferedImage> hiraganaKeyakiImages;
    
    public static List<BufferedImage> nogizakaImages() {
        if(nogizakaImages == null) {
            nogizakaImages = new ArrayList<>();
            try {
                //TODO:後ほどフォルダ指定に変える
                nogizakaImages.add(ImageIO.read(new ClassPathResource("images\\nogizaka\\logo_nogizaka.png").getInputStream()));
                nogizakaImages.add(ImageIO.read(new ClassPathResource("images\\nogizaka\\1st_guruguruka-ten1.png").getInputStream()));
                nogizakaImages.add(ImageIO.read(new ClassPathResource("images\\nogizaka\\2nd_oideshanpu-1.png").getInputStream()));
                nogizakaImages.add(ImageIO.read(new ClassPathResource("images\\nogizaka\\3rd_hasirebicycle1.png").getInputStream()));
                nogizakaImages.add(ImageIO.read(new ClassPathResource("images\\nogizaka\\4th_seihukunomanekin1.png").getInputStream()));
                nogizakaImages.add(ImageIO.read(new ClassPathResource("images\\nogizaka\\6th_ga-ruzuru-ru1.png").getInputStream()));
                nogizakaImages.add(ImageIO.read(new ClassPathResource("images\\nogizaka\\7th_baretta1.png").getInputStream()));
                nogizakaImages.add(ImageIO.read(new ClassPathResource("images\\nogizaka\\10th_nandomeno_aozoraka1.png").getInputStream()));
                nogizakaImages.add(ImageIO.read(new ClassPathResource("images\\nogizaka\\11th_inochihautukusii1.png").getInputStream()));
                nogizakaImages.add(ImageIO.read(new ClassPathResource("images\\nogizaka\\13th_imahanasitaidarekagairu1.png").getInputStream()));
                nogizakaImages.add(ImageIO.read(new ClassPathResource("images\\nogizaka\\15th_hadasidesummer1.png").getInputStream()));
                nogizakaImages.add(ImageIO.read(new ClassPathResource("images\\nogizaka\\16th_sayonaranoimi.png").getInputStream()));
                nogizakaImages.add(ImageIO.read(new ClassPathResource("images\\nogizaka\\19th_itukadekirukarakyoudekiru1.png").getInputStream()));
            } catch (IOException ex) {
                Logger.getLogger(ImageCollection.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return nogizakaImages;
    }
    
    public static List<BufferedImage> keyakizakaImages() {
        if(keyakizakaImages == null) {
            keyakizakaImages = new ArrayList<>();
            try {
                //TODO:後ほどフォルダ指定に変える
                keyakizakaImages.add(ImageIO.read(new ClassPathResource("images\\keyakizaka\\logo_keyakizaka.png").getInputStream()));
                keyakizakaImages.add(ImageIO.read(new ClassPathResource("images\\keyakizaka\\2nd_sekainihaaisikanainda1.png").getInputStream()));
                keyakizakaImages.add(ImageIO.read(new ClassPathResource("images\\keyakizaka\\3rd_hutarisezon1.png").getInputStream()));
                keyakizakaImages.add(ImageIO.read(new ClassPathResource("images\\keyakizaka\\4th_hukyouwaon1.png").getInputStream()));
                keyakizakaImages.add(ImageIO.read(new ClassPathResource("images\\keyakizaka\\5th_kazenihukaretemo1.png").getInputStream()));
                keyakizakaImages.add(ImageIO.read(new ClassPathResource("images\\keyakizaka\\6th_garasuwoware1.png").getInputStream()));
            } catch (IOException ex) {
                Logger.getLogger(ImageCollection.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return keyakizakaImages;
    }
    
    public static List<BufferedImage> hiraganaKeyakiImages() {
        if(hiraganaKeyakiImages == null) {
            hiraganaKeyakiImages = new ArrayList<>();
            try {
                //TODO:後ほどフォルダ指定に変える
                hiraganaKeyakiImages.add(ImageIO.read(new ClassPathResource("images\\hiraganakeyakizaka\\1.png").getInputStream()));
                hiraganaKeyakiImages.add(ImageIO.read(new ClassPathResource("images\\hiraganakeyakizaka\\2.png").getInputStream()));
                hiraganaKeyakiImages.add(ImageIO.read(new ClassPathResource("images\\hiraganakeyakizaka\\3.png").getInputStream()));
                hiraganaKeyakiImages.add(ImageIO.read(new ClassPathResource("images\\hiraganakeyakizaka\\4.png").getInputStream()));
                hiraganaKeyakiImages.add(ImageIO.read(new ClassPathResource("images\\hiraganakeyakizaka\\5.png").getInputStream()));
                hiraganaKeyakiImages.add(ImageIO.read(new ClassPathResource("images\\hiraganakeyakizaka\\6.png").getInputStream()));
                hiraganaKeyakiImages.add(ImageIO.read(new ClassPathResource("images\\hiraganakeyakizaka\\7.png").getInputStream()));
            } catch (IOException ex) {
                Logger.getLogger(ImageCollection.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return hiraganaKeyakiImages;
    }
}
