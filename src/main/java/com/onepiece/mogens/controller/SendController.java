package com.onepiece.mogens.controller;

import com.onepiece.mogens.config.ALiConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Goo Tsung-jen
 * @create 2019-06-17  16:36
 * Innovation distinguishes between a leader and a follower.
 */
@RestController
@RequestMapping("/send")
@RefreshScope
public class SendController {
    @Autowired
    ALiConfig aLiConfig;

    @Value("${aliyun.regionId}")
    private  String a;

    @GetMapping("/test")
    public String test() {



        return "========原来是default========="+aLiConfig.getRegionId()+"================="+a;

    }



     //此controller分为以下几个方法
    /**
     * 1.发送短信
     * 服务调用者
     * 短信唯一标示（主键）独立服务
     *
     */
//    @PostMapping("/sms")
//    public


    /**
     * 2.根据ip查询某一条短信
     */


    /**
     *3.根据调用者批量查询
     */


}
