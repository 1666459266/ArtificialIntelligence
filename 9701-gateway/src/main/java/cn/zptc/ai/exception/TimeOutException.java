package cn.zptc.ai.exception;

import cn.zptc.ai.util.Constant;
import cn.zptc.ai.util.ResponseUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * 全局异常处理
 */
@ControllerAdvice
@Slf4j
public class TimeOutException {
    @ExceptionHandler(Exception.class)
    public ResponseUtil timeOutExceptionHandler(){
        log.info("请求超时，请稍后再试");
        return new ResponseUtil(Constant.RUN_TIME_OUT,"请求超时，请稍后再试");
    }
}
