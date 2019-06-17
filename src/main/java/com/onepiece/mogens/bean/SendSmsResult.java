package com.onepiece.mogens.bean;

import lombok.Data;

/**
 * 发送短信返回实体类
 * @author Goo Tsung-jen
 * @create 2019-06-17  08:46
 * Innovation distinguishes between a leader and a follower.
 */
@Data
public class SendSmsResult {

    /** 发送回执ID，可根据该ID在接口QuerySendDetails中查询具体的发送状态.*/
    private String  BizId;

    /** 请求状态码，返回OK代表请求成功.*/
    private String  Code;

    /** 状态码的描述.*/
    private String  Message;

    /** 请求ID.*/
    private String  RequestId;

}
