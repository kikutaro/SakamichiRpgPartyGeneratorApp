package com.sakamichi46.rpgparty.generator;

import com.sakamichi46.rpgparty.collection.ImageCollection;
import com.sakamichi46.rpgparty.collection.JobCollection;
import com.sakamichi46.rpgparty.collection.KeyakizakaCollection;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class KeyakizakaGenerator extends Generator {
    public KeyakizakaGenerator() {
        super(KeyakizakaCollection.members(),
                JobCollection.jobs(),
                ImageCollection.keyakizakaImages()
        );
    }
}
