package com.onepiece.mogens.bean;

import lombok.Data;

/**
 * 阿里云发送短信请求参数
 * @author Goo Tsung-jen
 * @create 2019-06-14  18:25
 * Innovation distinguishes between a leader and a follower.
 */
@Data
public class SendSms {
    /** 接收短信的手机号码。.*/
    private String PhoneNumbers;

    /** 短信签名名称.*/
    private String SignName;

    /** 短信模板ID.*/
    private String TemplateCode;

    /** 主账号AccessKey的ID.*/
    private String AccessKeyId;

    /** 系统规定参数。取值：SendSms.*/
    private String Action;

    /** 外部流水扩展字段.*/
    private String OutId;

    /** 上行短信扩展码，无特殊需要此字段的用户请忽略此字段。.*/
    private String SmsUpExtendCode;

    /** 短信模板变量对应的实际值，JSON格式.*/
    private String TemplateParam;

}
