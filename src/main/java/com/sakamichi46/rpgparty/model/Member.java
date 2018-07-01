package com.sakamichi46.rpgparty.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
public class Member {
    private String name;
    private String nameHiragana;
    private int weight;
}