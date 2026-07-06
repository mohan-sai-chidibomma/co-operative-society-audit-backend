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

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }
}
