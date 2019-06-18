package com.onepiece.mogens.service;

import com.aliyuncs.CommonRequest;
import com.aliyuncs.CommonResponse;
import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.exceptions.ServerException;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.profile.DefaultProfile;
import com.google.gson.Gson;
import com.onepiece.mogens.bean.SendSmsResult;
import com.onepiece.mogens.config.ALiConfig;
import com.onepiece.mogens.enums.ActionEnum;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Goo Tsung-jen
 * @create 2019-06-17  13:33
 * Innovation distinguishes between a leader and a follower.
 */
@Service
@Slf4j
public class SendSmsService {

    @Autowired
    ALiConfig aLiConfig;

    /**
     * 发送短信，todo 群发及查询复写
     * @return
     */
    public SendSmsResult sendSms() {
        Gson gson=new Gson();
        String aciton = ActionEnum.SENDSMS.getCode();
        Map<String,String> parameter = new HashMap();
        parameter.put("PhoneNumbers", "18645044434");
        parameter.put("SignName", "中州智惠");
        parameter.put("TemplateCode", "SMS_158036625");
        parameter.put("TemplateParam", "{\"code\":\"1111\"}");

//      parameter.put("SmsUpExtendCode", "上行短信扩展码，无特殊需要此字段的用户请忽略此字段");
//      parameter.put("OutId", "外部流水扩展字段");

        String result=this.send(aciton, parameter);
        SendSmsResult sendSmsResult=gson.fromJson(result, SendSmsResult.class);
        log.info("发送短信+{}",sendSmsResult);
        return sendSmsResult;
    }


    /**
     * 操作阿里云共用方法
     * @param action 执行何种动作
     * @param map 该操作的参数
     * @return 返回阿里云Json字符串
     */
    public String send(String action,Map<String,String> map) {
        //填写配置信息
        DefaultProfile profile = DefaultProfile.getProfile(aLiConfig.getRegionId(), aLiConfig.getAccessKeyId(), aLiConfig.getAccessSecret());
        IAcsClient client = new DefaultAcsClient(profile);
        CommonRequest request = new CommonRequest();
        request.setMethod(MethodType.POST);
        request.setDomain(aLiConfig.getDomain());
        request.setVersion(aLiConfig.getVersion());
        request.setAction(action);
        map.forEach((key, value) -> {
            request.putQueryParameter(key, value);
        });

        try {
            CommonResponse response = client.getCommonResponse(request);
            return response.getData();
        } catch (ServerException e) {
            e.printStackTrace();
        } catch (ClientException e) {
            e.printStackTrace();
        }
        return null;

    }

    //{"Message":"OK","RequestId":"F3C628FE-E216-44B2-B17C-7AFD42AAEA5A","BizId":"416910260756818442^0","Code":"OK"}
}
