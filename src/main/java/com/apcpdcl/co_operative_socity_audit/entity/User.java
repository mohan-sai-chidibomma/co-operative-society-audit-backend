package com.apcpdcl.co_operative_socity_audit.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    private String userName;
    private String password;
    private Long mobileNumber;
    private String name;
    private Long aadhaarNumber;
    private String pan;
    private String mode;
    private String address;
    private String depositType;

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public User(String name, Long aadhaarNumber, String pan, String userName) {
        this.name = name;
        this.aadhaarNumber = aadhaarNumber;
        this.pan = pan;
        this.userName = userName;
    }

    public User(String userName, String name, Long aadhaarNumber, String pan, String mode, String address, String depositeType) {
        this.userName = userName;
        this.name = name;
        this.aadhaarNumber = aadhaarNumber;
        this.pan = pan;
        this.mode = mode;
        this.address = address;
        this.depositType = depositeType;
    }

    public User(String userName,Long mobileNumber) {
        this.userName = userName;
        this.mobileNumber=mobileNumber;
    }
}
