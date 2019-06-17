package com.onepiece.mogens.service;

import com.onepiece.mogens.bean.SendSmsResult;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringRunner.class)
public class SendSmsServiceTest {

    @Autowired
    SendSmsService sendSmsService;
    @Test
    public void sendSms() {
        SendSmsResult result=sendSmsService.sendSms();
        Assert.assertNotNull(result);
    }
}