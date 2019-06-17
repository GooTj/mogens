package com.onepiece.mogens.enums;

import lombok.Getter;

/**
 * 动作enum
 */
@Getter
public enum ActionEnum {
    /** 单次发送短信.*/
    SENDSMS("SendSms","单次发送短信"),
    /** 批量发送短息.*/
    SENDBATCHSMS("SendBatchSms","批量发送短息"),
    /** 批量发送短息.*/
    QUERYSENDDETAILS("QuerySendDetails","查看短信发送记录及发送状态"),
    ;
    private String code;
    private String message;

    ActionEnum(String code, String message){
        this.code = code;
        this.message = message;
    }
}
