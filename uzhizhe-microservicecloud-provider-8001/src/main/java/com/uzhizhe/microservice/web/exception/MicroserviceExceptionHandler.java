package com.uzhizhe.microservice.web.exception;

import com.monker.common.exception.ErrorServiceException;
import com.monker.common.exception.NormalServiceException;
import com.monker.common.result.ResponseDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author qingjiang.li
 * @date 2019-05-22 5:14 PM
 */
@RestControllerAdvice
public class MicroserviceExceptionHandler {

    private static final Logger log = LoggerFactory.getLogger(MicroserviceExceptionHandler.class);

    @ExceptionHandler({ NormalServiceException.class })
    public ResponseDto handleNormalServiceException(NormalServiceException e) {
        log.warn("NormalException:{}", e.getMessage());
        return ResponseDto.error(e.getMessage());
    }

    @ExceptionHandler({ ErrorServiceException.class })
    public ResponseDto handleErrorServiceException(ErrorServiceException e) {
        log.error("ErrorException:", e);
        return ResponseDto.error(e.getMessage());
    }
    @ExceptionHandler({ Exception.class })
    public ResponseDto handleException(Exception e) {
        log.error("Exception:", e);
        return ResponseDto.error(e.getMessage());
    }



}
