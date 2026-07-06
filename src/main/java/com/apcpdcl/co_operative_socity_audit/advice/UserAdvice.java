package com.apcpdcl.co_operative_socity_audit.advice;

import com.apcpdcl.co_operative_socity_audit.exception.PasswordIncorrectException;
import com.apcpdcl.co_operative_socity_audit.exception.UserAlreadyExistException;
import com.apcpdcl.co_operative_socity_audit.exception.UserNameNotRegisteredException;
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

    @ExceptionHandler(PasswordIncorrectException.class)
    public ResponseEntity<ErrorDetails> passwordIncorrect(PasswordIncorrectException e){
        ErrorDetails errorDetailsObj=new ErrorDetails(e.getMessage());
        return new ResponseEntity<ErrorDetails>(errorDetailsObj,HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(UserNameNotRegisteredException.class)
    public ResponseEntity<ErrorDetails> userUnregistered(UserNameNotRegisteredException e){
        ErrorDetails errorDetailsObj=new ErrorDetails(e.getMessage());
        return new ResponseEntity<ErrorDetails>(errorDetailsObj,HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(Exception.class)
    public  ResponseEntity<ErrorDetails> exception(Exception e){
         ErrorDetails errorDetailsObj=new ErrorDetails(e.getMessage());
         return new ResponseEntity<ErrorDetails>(errorDetailsObj,HttpStatus.INTERNAL_SERVER_ERROR);
    }

}
