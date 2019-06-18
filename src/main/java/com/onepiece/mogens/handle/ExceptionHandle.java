package com.onepiece.mogens.handle;

import com.onepiece.mogens.exception.MogensException;
import com.onepiece.mogens.utils.ResultVoUtil;
import com.onepiece.mogens.vo.ResultVO;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Goo Tsung-jen
 * @create 2019-06-18  13:57
 * Innovation distinguishes between a leader and a follower.
 */
@ControllerAdvice
public class ExceptionHandle {
    @ExceptionHandler(value= MogensException.class)
    @ResponseBody
    public ResultVO resultHandle(MogensException mogensException) {
        return ResultVoUtil.error(mogensException.getCode() ,mogensException.getMessage());
    }
}
