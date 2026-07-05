package com.apcpdcl.co_operative_socity_audit.repository;

import com.apcpdcl.co_operative_socity_audit.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISocietyRepo extends JpaRepository<User,Integer> {

}
