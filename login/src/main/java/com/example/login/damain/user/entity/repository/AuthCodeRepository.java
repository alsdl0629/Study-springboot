package com.example.login.damain.user.entity.repository;

import com.example.login.damain.user.entity.AuthCode;
import org.springframework.data.repository.CrudRepository;

public interface AuthCodeRepository extends CrudRepository<AuthCode, String> {
}