package com.example.SpringBoot.Database.repositories;

import com.example.SpringBoot.Database.model.AuthUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<AuthUser, Long> {


}