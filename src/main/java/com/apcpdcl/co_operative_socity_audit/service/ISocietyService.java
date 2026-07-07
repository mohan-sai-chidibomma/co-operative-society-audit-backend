package com.apcpdcl.co_operative_socity_audit.service;

import com.apcpdcl.co_operative_socity_audit.entity.User;

public interface ISocietyService {
        User registerUser(User userDetails);
        Boolean loginUser(String userName,String password);
        User applicationForm(User formDetails);
        User updateMobileNumber(User userDetails);
        User getUserDetails(String userName);
}
