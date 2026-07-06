package com.apcpdcl.co_operative_socity_audit.service;

import com.apcpdcl.co_operative_socity_audit.entity.User;
import com.apcpdcl.co_operative_socity_audit.exception.PasswordIncorrectException;
import com.apcpdcl.co_operative_socity_audit.exception.UserAlreadyExistException;
import com.apcpdcl.co_operative_socity_audit.exception.UserNameNotRegisteredException;
import com.apcpdcl.co_operative_socity_audit.repository.ISocietyRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SocietyService implements ISocietyService {

    @Autowired
    private ISocietyRepo repo;


    @Override
    public User registerUser(User userDetails) {
        Optional<User> optionalUser = repo.findByUserName(userDetails.getUserName());
        if(optionalUser.isPresent()){
            throw new UserAlreadyExistException("username already exist");
        }

        return repo.save(userDetails);
    }

    @Override
    public Boolean loginUser(String userName,String password){
        User findUser = repo.findByUserName(userName).orElseThrow(()->new UserNameNotRegisteredException("User not registered"));
        if(password.equals(findUser.getPassword())) {
            return true;
        }
        throw new PasswordIncorrectException("Please enter correct password and try again");
    }
}



