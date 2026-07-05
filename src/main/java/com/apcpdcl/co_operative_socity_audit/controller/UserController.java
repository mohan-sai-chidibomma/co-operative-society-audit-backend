package com.apcpdcl.co_operative_socity_audit.controller;

import com.apcpdcl.co_operative_socity_audit.entity.User;
import com.apcpdcl.co_operative_socity_audit.service.ISocietyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private ISocietyService service;

    @PostMapping("/register")
    public ResponseEntity<User> registerUser(@RequestBody User userDetails){
         User registeredUser = service.registerUser(userDetails);
//         return new ResponseEntity<>(registeredUser, HttpStatus.OK);
         return ResponseEntity.ok(registeredUser);
    }

}
