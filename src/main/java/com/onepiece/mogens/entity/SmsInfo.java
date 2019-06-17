package com.onepiece.mogens.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

/**
 * @author Goo Tsung-jen
 * @create 2019-06-17  18:47
 * Innovation distinguishes between a leader and a follower.
 */
@Data
@Entity
public class SmsInfo {
    /** 主键ID */
    @Id
    private String id ;

    /** 模板ID */
    private String template ;

    /** 阿里云发送回执ID */
    private String bizId ;

    /** 阿里云请求ID */
    private String requestId ;

    /** 接收者手机号 */
    private String phone ;

    /** 内容 */
    private String info ;

    /** 状态;发送请求-1，请求成功-2，请求失败-3，用户接收成功-4，用户接收失败-5 */
    private Integer status ;

    /** 模板号 */
    private String templateCode ;

    /** 签名 */
    private String signName ;

    /** 请求状态码 */
    private String code ;

    /** 请求状态码描述 */
    private String message ;

    /** 回执状态码 */
    private String errCode ;

    /** 回执状态码描述;失败信息 */
    private String errMsg ;

    /** 短信长度 */
    private String smsSize ;

    /** 创建人;服务名 */
    private String createdBy ;

    /** 创建时间 */
    private Date createdTime ;

    /** 更新人 */
    private String updatedBy ;

    /** 更新时间 */
    private Date updatedTime ;

}
