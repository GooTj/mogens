package com.onepiece.mogens.exception;

import com.onepiece.mogens.enums.ResultEnum;
import lombok.Data;

/**
 * @author Goo Tsung-jen
 * @create 2019-06-18  13:59
 * Innovation distinguishes between a leader and a follower.
 */
@Data
public class MogensException extends RuntimeException {
    private String code;

    public MogensException(ResultEnum resultEnum) {
        super(resultEnum.getMsg());
        this.code = resultEnum.getCode();
    }

    public MogensException(String code, String message) {
        super(message);
        this.code = code;

    }

}
