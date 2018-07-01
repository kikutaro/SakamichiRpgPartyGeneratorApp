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
    
    private static List<BufferedImage> images;
    
    public static List<BufferedImage> nogizakaImages() {
        if(images == null) {
            images = new ArrayList<>();
            try {
                //TODO:後ほどフォルダ指定に変える
                images.add(ImageIO.read(new ClassPathResource("images\\nogizaka\\logo_nogizaka.png").getInputStream()));
                images.add(ImageIO.read(new ClassPathResource("images\\nogizaka\\1st_guruguruka-ten1.png").getInputStream()));
                images.add(ImageIO.read(new ClassPathResource("images\\nogizaka\\2nd_oideshanpu-1.png").getInputStream()));
                images.add(ImageIO.read(new ClassPathResource("images\\nogizaka\\3rd_hasirebicycle1.png").getInputStream()));
                images.add(ImageIO.read(new ClassPathResource("images\\nogizaka\\4th_seihukunomanekin1.png").getInputStream()));
                images.add(ImageIO.read(new ClassPathResource("images\\nogizaka\\6th_ga-ruzuru-ru1.png").getInputStream()));
                images.add(ImageIO.read(new ClassPathResource("images\\nogizaka\\7th_baretta1.png").getInputStream()));
                images.add(ImageIO.read(new ClassPathResource("images\\nogizaka\\10th_nandomeno_aozoraka1.png").getInputStream()));
                images.add(ImageIO.read(new ClassPathResource("images\\nogizaka\\11th_inochihautukusii1.png").getInputStream()));
                images.add(ImageIO.read(new ClassPathResource("images\\nogizaka\\13th_imahanasitaidarekagairu1.png").getInputStream()));
                images.add(ImageIO.read(new ClassPathResource("images\\nogizaka\\15th_hadasidesummer1.png").getInputStream()));
                images.add(ImageIO.read(new ClassPathResource("images\\nogizaka\\16th_sayonaranoimi.png").getInputStream()));
                images.add(ImageIO.read(new ClassPathResource("images\\nogizaka\\19th_itukadekirukarakyoudekiru1.png").getInputStream()));
            } catch (IOException ex) {
                Logger.getLogger(ImageCollection.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return images;
    }
}
