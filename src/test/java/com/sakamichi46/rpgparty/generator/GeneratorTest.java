/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sakamichi46.rpgparty.generator;

import com.sakamichi46.rpgparty.collection.ImageCollection;
import com.sakamichi46.rpgparty.collection.JobCollection;
import com.sakamichi46.rpgparty.collection.NogizakaCollection;
import com.sakamichi46.rpgparty.model.Member;
import java.awt.image.BufferedImage;
import java.util.Arrays;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.springframework.core.io.ClassPathResource;

/**
 *
 * @author kikuta
 */
public class GeneratorTest {
    
    public GeneratorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void generate() {
        Generator generator = new Generator(
                NogizakaCollection.members(),
                JobCollection.jobs(),
        ImageCollection.nogizakaImages());
        generator.generate("キクタロー");
    }
    
    @Test
    public void images() {
         boolean a = new ClassPathResource("images\\nogizaka\\logo_nogizaka.png").exists();
        
        List<BufferedImage> nogizakaImages = ImageCollection.nogizakaImages();
        System.out.println(nogizakaImages.size());
    }
}
