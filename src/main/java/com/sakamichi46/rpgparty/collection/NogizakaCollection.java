package com.sakamichi46.rpgparty.collection;

import com.sakamichi46.rpgparty.model.Member;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NogizakaCollection {
    
    private static List<Member> members;
    
    public static List<Member> members() {
        if(members == null) {
            return Stream.of(
                    new Member("秋元 真夏","あきもと まなつ", 10),
                    new Member("生田 絵梨花","いくた えりか", 10),
                    new Member("井上 小百合","いのうえ さゆり", 10),
                    new Member("衛藤 美彩","えとう みさ", 3),
                    new Member("齋藤 飛鳥","さいとう あすか", 10),
                    new Member("斉藤 優里","さいとう ゆうり", 7),
                    new Member("桜井 玲香","さくらい れいか", 10),
                    new Member("白石 麻衣","しらいし まい", 10),
                    new Member("高山 一実","たかやま かずみ", 10),
                    new Member("中田 花奈","なかだ かな", 10),
                    new Member("西野 七瀬","にしの ななせ", 3),
                    new Member("樋口 日奈","ひぐち ひな", 10),
                    new Member("星野 みなみ","ほしの みなみ", 10),
                    new Member("松村 沙友理","まつむら さゆり", 10),
                    new Member("和田 まあや","わだ まあや", 10),
                    new Member("伊藤 かりん","いとう かりん", 7),
                    new Member("伊藤 純奈","いとう じゅんな", 10),
                    new Member("北野 日奈子","きたの ひなこ", 10),
                    new Member("佐々木 琴子","ささき ことこ", 10),
                    new Member("新内 眞衣","しんうち まい", 10),
                    new Member("鈴木 絢音","すずき あやね", 10),
                    new Member("寺田 蘭世","てらだ らんぜ", 10),
                    new Member("堀 未央奈","ほり みおな", 10),
                    new Member("山崎 怜奈","やまざき れな", 10),
                    new Member("渡辺 みり愛","わたなべ みりあ", 10),
                    new Member("伊藤 理々杏","いとう りりあ", 10),
                    new Member("岩本 蓮加","いわもと れんか", 10),
                    new Member("梅澤 美波","うめざわ みなみ", 10),
                    new Member("大園 桃子","おおぞの ももこ", 10),
                    new Member("久保 史緒里","くぼ しおり", 10),
                    new Member("阪口 珠美","さかぐち たまみ", 10),
                    new Member("佐藤 楓","さとう かえで", 10),
                    new Member("中村 麗乃","なかむら れの", 10),
                    new Member("向井 葉月","むかい はづき", 10),
                    new Member("山下 美月","やました みづき", 10),
                    new Member("吉田 綾乃クリスティー","よしだ あやのクリスティー", 10),
                    new Member("与田 祐希","よだ ゆうき", 10),
                    new Member("遠藤 さくら","えんどう さくら",10),
                    new Member("賀喜 遥香","かき はるか",10),
                    new Member("掛橋 沙耶香","かけはし さやか",10),
                    new Member("金川 紗耶","かながわ さや",10),
                    new Member("北川 悠理","きたがわ ゆり",10),
                    new Member("柴田 柚菜","しばた ゆな",10),
                    new Member("清宮 レイ","せいみや れい",10),
                    new Member("田村 真佑","たむら まゆ",10),
                    new Member("筒井 あやめ","つつい あやめ",10),
                    new Member("早川 聖来","はやかわ せいら",10),
                    new Member("矢久保 美緒","やくぼ みお",10),
                    new Member("市來 玲奈","いちき れな", 2),
                    new Member("伊藤 寧々","いとう ねね", 1),
                    new Member("畠中 清羅","はたなか せいら", 1),
                    new Member("松井 玲奈","まつい れな", 1),
                    new Member("永島 聖羅","ながしま せいら", 1),
                    new Member("深川 麻衣","ふかがわ まい", 3),
                    new Member("橋本 奈々未","はしもと ななみ", 3),
                    new Member("中元 日芽香","なかもと ひめか", 3),
                    new Member("伊藤 万理華","いとう まりか", 3),
                    new Member("川村 真洋","かわむら まひろ", 1),
                    new Member("生駒 里奈","いこま りな", 3),
                    new Member("斎藤 ちはる","さいとう ちはる", 2),
                    new Member("相楽 伊織","さがら いおり", 1),
                    new Member("川後 陽菜","かわご ひな", 2),
                    new Member("若月 佑美","わかつき ゆみ", 3),
                    new Member("能條 愛未","のうじょう あみ", 1)
            ).collect(Collectors.toList());
        } else {
            return members;
        }
    }  
}
