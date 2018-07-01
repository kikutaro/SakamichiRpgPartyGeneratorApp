package com.sakamichi46.rpgparty.model;

import java.awt.image.BufferedImage;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
public class PartyMember extends Member {
    
    private String job;
    private BufferedImage image;
    
    public PartyMember(Member member) {
        this.setName(member.getName());
        this.setNameHiragana(member.getNameHiragana());
    }
    
    public PartyMember(String name, String nameHiragana, String job, BufferedImage image) {
        this.setName(name);
        this.setNameHiragana(nameHiragana);
        this.setJob(job);
        this.setImage(image);
    }
}
