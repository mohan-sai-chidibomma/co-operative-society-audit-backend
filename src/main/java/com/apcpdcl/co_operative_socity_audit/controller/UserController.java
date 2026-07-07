package com.apcpdcl.co_operative_socity_audit.controller;

import com.apcpdcl.co_operative_socity_audit.dto.LoginSuccessResponse;
import com.apcpdcl.co_operative_socity_audit.entity.User;
import com.apcpdcl.co_operative_socity_audit.service.ISocietyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    private ISocietyService service;

    @PostMapping("/register")
    public ResponseEntity<User> registerUser(@RequestBody User userDetails){
      User registedUser= service.registerUser(userDetails);
      return new ResponseEntity<User>(registedUser,HttpStatus.CREATED);
    }

    @PostMapping("/login")
    public ResponseEntity<LoginSuccessResponse> loginUser(@RequestBody User userDetails){
      Boolean isCorrect = service.loginUser(userDetails.getUserName(), userDetails.getPassword());
      LoginSuccessResponse loginSuccessResponseObject = new LoginSuccessResponse(isCorrect);
      return new ResponseEntity<LoginSuccessResponse>(loginSuccessResponseObject, HttpStatus.OK);
    }

    @PostMapping("/form")
    public ResponseEntity<User> applicationForm(@RequestBody User formDetails){
        User savedForm = service.applicationForm(formDetails);
        return new ResponseEntity<>(savedForm,HttpStatus.CREATED);
    }

    @PatchMapping("/update")
    public ResponseEntity<User> updateMobileNumber(@RequestBody User userDetails){
       User updated=service.updateMobileNumber(userDetails);
       return new ResponseEntity<>(updated,HttpStatus.OK);
    }

    @GetMapping("/get-details/{userName}")
    public ResponseEntity<User> getDetailsByUserName(@PathVariable String userName){
        User userDetails= service.getUserDetails(userName);
        return new ResponseEntity<>(userDetails,HttpStatus.OK);
    }




}
