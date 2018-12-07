package com.sakamichi46.rpgparty.collection;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JobCollection {
    
    private static List<String> jobs;
    
    public static List<String> jobs() {
        if(jobs == null) {
            return Stream.of(
                    "せんし　　　",
                    "そうりょ　　",
                    "まほうつかい",
                    "ぶどうか　　",
                    "しょうにん　",
                    "あそびにん　",
                    "けんじゃ　　",
                    "とうぞく　　",
                    "おどりこ　　",
                    "まほうせんし",
                    "かいぞく　　"
                    ).collect(Collectors.toList());
        } else {
            return jobs;
        }
    }
}
