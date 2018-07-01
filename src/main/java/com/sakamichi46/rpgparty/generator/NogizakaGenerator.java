package com.sakamichi46.rpgparty.generator;

import com.sakamichi46.rpgparty.collection.ImageCollection;
import com.sakamichi46.rpgparty.collection.JobCollection;
import com.sakamichi46.rpgparty.collection.NogizakaCollection;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class NogizakaGenerator extends Generator {
    public NogizakaGenerator() {
        super(NogizakaCollection.members(),
                JobCollection.jobs(),
                ImageCollection.nogizakaImages()
        );
    }
}
