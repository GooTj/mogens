package com.onepiece.mogens.enums;

import lombok.Getter;

/**
 * @author Goo Tsung-jen
 * @create 2019-06-18  14:06
 * Innovation distinguishes between a leader and a follower.
 */
@Getter
public enum  ResultEnum {
    SUCCESS("0000", "请求成功"),
            ;
    private String code;
    private String msg;

    ResultEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
