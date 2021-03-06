package com.sakamichi46.rpgparty.collection;

import com.sakamichi46.rpgparty.model.Member;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class KeyakizakaCollection {
    
    private static List<Member> members;
    
    public static List<Member> members() {
        if(members == null) {
            return Stream.of(
                    new Member("石森 虹花","いしもり にじか", 10),
                    new Member("上村 莉菜","うえむら りな", 10),
                    new Member("尾関 梨香","おぜき りか", 10),
                    new Member("織田 奈那","おだ なな", 10),
                    new Member("小池 美波","こいけ みなみ", 10),
                    new Member("小林 由依","こばやし ゆい", 10),
                    new Member("齋藤 冬優花","さいとう ふゆか", 10),
                    new Member("佐藤 詩織","さとう しおり", 10),
                    new Member("菅井 友香","すがい ゆうか", 10),
                    new Member("鈴本 美愉","すずもと みゆ", 10),
                    new Member("長沢 菜々香","ながさわ ななこ", 10),
                    new Member("長濱 ねる","ながはま ねる", 10),
                    new Member("土生 瑞穂","はぶ みづほ", 10),
                    new Member("原田 葵","はらだ あおい", 10),
                    new Member("平手 友梨奈","ひらて ゆりな", 10),
                    new Member("守屋 茜","もりや あかね", 10),
                    new Member("渡辺 梨加","わたなべ りか", 10),
                    new Member("渡邉 理佐","わたなべ りさ", 10),
                    new Member("井上 梨名","いのうえ りな",10),
                    new Member("関 有美子","せき ゆみこ",10),
                    new Member("武元 唯衣","たけもと ゆい",10),
                    new Member("田村 保乃","たむら ほの",10),
                    new Member("藤吉 夏鈴","ふじよし かりん",10),
                    new Member("松田 里奈","まつだ りな",10),
                    new Member("松平 璃子","まつだいら りこ",10),
                    new Member("森田 ひかる","もりた ひかる",10),
                    new Member("山﨑 天","やまさき てん",10),
                    new Member("今泉 佑唯","いまいずみ ゆい", 1),
                    new Member("志田 愛佳","しだ まなか", 1),
                    new Member("米谷 奈々未","よねたに ななみ", 1)
            ).collect(Collectors.toList());
        } else {
            return members;
        }
    }  
}
