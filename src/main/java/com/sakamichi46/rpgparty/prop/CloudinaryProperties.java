package com.sakamichi46.rpgparty.prop;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "cloudinary")
@Getter @Setter
public class CloudinaryProperties {
    private String on;
    private String cloudname;
    private String apikey;
    private String apisecret;
}
