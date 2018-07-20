package com.sakamichi46.rpgparty.collection;

import com.sakamichi46.rpgparty.model.Member;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HiraganaKeyakiCollection {
    
    private static List<Member> members;
    
    public static List<Member> members() {
        if(members == null) {
            return Stream.of(
                    new Member("井口 眞緒","いぐち まお", 10),
                    new Member("潮 紗理菜","うしお さりな", 10),
                    new Member("柿崎 芽実","かきざき めみ", 10),
                    new Member("影山 優佳","かげやま ゆうか", 10),
                    new Member("加藤 史帆","かとう しほ", 10),
                    new Member("齊藤 京子","さいとう きょうこ", 10),
                    new Member("佐々木 久美","ささき くみ", 10),
                    new Member("佐々木 美玲","ささき みれい", 10),
                    new Member("高瀬 愛奈","たかせ まな", 10),
                    new Member("高本 彩花","たかもと あやか", 10),
                    new Member("東村 芽依","ひがしむら めい", 10),
                    new Member("金村 美玖","かねむら みく", 10),
                    new Member("河田 陽菜","かわた ひな", 10),
                    new Member("小坂 菜緒","こさか なお", 10),
                    new Member("富田 鈴花","とみた すずか", 10),
                    new Member("丹生 明里","にぶ あかり", 10),
                    new Member("濱岸 ひより","はまぎし ひより", 10),
                    new Member("松田 好花","まつだ このか", 10),
                    new Member("宮田 愛萌","みやた まなも", 10),
                    new Member("渡邉 美穂","わたなべ みほ", 10)
            ).collect(Collectors.toList());
        } else {
            return members;
        }
    }  
}
