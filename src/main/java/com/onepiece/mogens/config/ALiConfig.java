package com.onepiece.mogens.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @author Goo Tsung-jen
 * @create 2019-06-17  14:03
 * Innovation distinguishes between a leader and a follower.
 */
@Configuration
//@Component
//@ConfigurationProperties("aliyun")
@Data
public class ALiConfig {
    /** 主账号AccessKey的ID.*/
    @Value("${aliyun.accessKeyId}")
    private String accessKeyId;

    /** accessSecret.*/
    @Value("${aliyun.accessSecret}")
    private String accessSecret;

    /** regionId.*/
    @Value("${aliyun.regionId}")
    private String regionId;

    /** .*/
    @Value("${aliyun.domain}")
    private String domain;

    /** .*/
    @Value("${aliyun.version}")
    private String version;



//    /** .*/
//    @Value("${}")
//    private String ;


}
