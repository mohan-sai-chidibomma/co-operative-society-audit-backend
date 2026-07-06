package com.apcpdcl.co_operative_socity_audit.advice;

import com.apcpdcl.co_operative_socity_audit.exception.UserAlreadyExistException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class UserAdvice {

    @ExceptionHandler(UserAlreadyExistException.class)
    public ResponseEntity<ErrorDetails> userAlreadyExist(UserAlreadyExistException e){
        ErrorDetails errorDetailsObj=new ErrorDetails(e.getMessage());
        return new ResponseEntity<ErrorDetails>(errorDetailsObj, HttpStatus.BAD_REQUEST);

    }

    @ExceptionHandler(Exception.class)
    public  ResponseEntity<ErrorDetails> exception(Exception e){
         ErrorDetails errorDetailsObj=new ErrorDetails(e.getMessage());
         return new ResponseEntity<ErrorDetails>(errorDetailsObj,HttpStatus.INTERNAL_SERVER_ERROR);
    }

}
