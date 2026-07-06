package com.apcpdcl.co_operative_socity_audit.controller;

import com.apcpdcl.co_operative_socity_audit.entity.User;
import com.apcpdcl.co_operative_socity_audit.service.ISocietyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private ISocietyService service;

      @PostMapping("/register")
        public User registerUser(@RequestBody User userDetails){
          return service.registerUser(userDetails);
        }
}
