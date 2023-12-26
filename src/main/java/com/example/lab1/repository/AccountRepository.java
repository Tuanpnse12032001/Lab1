package com.example.lab1.repository;

import com.example.lab1.entity.Account;
import com.example.lab1.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {

    Account findByUsernameAndPassword(String username, String password);

}