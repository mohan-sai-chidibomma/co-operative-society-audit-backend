package com.apcpdcl.co_operative_socity_audit.entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class VerificationForm {
    private Integer fixedDepositNumber;
    private Integer amount;
    private Integer dateOfDeposit;
    private  Integer dateOfMaturity;
    private Integer maturityAmount;
}
