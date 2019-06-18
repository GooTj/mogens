package com.onepiece.mogens.utils;

import com.onepiece.mogens.enums.ResultEnum;
import com.onepiece.mogens.vo.ResultVO;

/**
 * @author Goo Tsung-jen
 * @create 2019-06-18  14:52
 * Innovation distinguishes between a leader and a follower.
 */
public class ResultVoUtil {

    public static ResultVO success(Object object) {
        ResultVO resultVo = new ResultVO();
        resultVo.setCode(ResultEnum.SUCCESS.getCode());
        resultVo.setData(object);
        resultVo.setMsg(ResultEnum.SUCCESS.getMsg());
        return resultVo;
    }

    public static ResultVO success() {
        ResultVO resultVo = new ResultVO();
        resultVo.setCode(ResultEnum.SUCCESS.getCode());
        resultVo.setMsg(ResultEnum.SUCCESS.getMsg());
        return resultVo;
    }

    public static ResultVO error(ResultEnum resultEnum) {
        ResultVO resultVo = new ResultVO();
        resultVo.setCode(resultEnum.getCode());
        resultVo.setMsg(resultEnum.getMsg());
        return resultVo;
    }

    public static ResultVO error(String code,String msg) {
        ResultVO resultVo = new ResultVO();
        resultVo.setCode(code);
        resultVo.setMsg(msg);
        return resultVo;
    }

}
