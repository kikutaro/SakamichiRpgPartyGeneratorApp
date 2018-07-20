package com.sakamichi46.rpgparty.generator;

import com.sakamichi46.rpgparty.collection.HiraganaKeyakiCollection;
import com.sakamichi46.rpgparty.collection.ImageCollection;
import com.sakamichi46.rpgparty.collection.JobCollection;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class HiraganaKeyakiGenerator extends Generator {
    public HiraganaKeyakiGenerator() {
        super(HiraganaKeyakiCollection.members(),
                JobCollection.jobs(),
                ImageCollection.hiraganaKeyakiImages()
        );
    }
}
