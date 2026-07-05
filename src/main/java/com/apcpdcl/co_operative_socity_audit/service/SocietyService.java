package com.apcpdcl.co_operative_socity_audit.service;

import com.apcpdcl.co_operative_socity_audit.entity.User;
import com.apcpdcl.co_operative_socity_audit.repository.ISocietyRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SocietyService implements ISocietyService {

    @Autowired
    private ISocietyRepo repo;


    @Override
    public User registerUser(User userDetails) {
       return repo.save(userDetails);
    }
}
