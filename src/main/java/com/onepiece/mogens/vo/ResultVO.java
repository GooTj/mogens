package com.onepiece.mogens.vo;

import lombok.Data;

/**
 * @author Goo Tsung-jen
 * @create 2019-06-18  14:40
 * Innovation distinguishes between a leader and a follower.
 */
@Data
public class ResultVO<T> {
    private String code;
    private String msg;
    private T data;
}
