package com.vika.springit.repository;

import com.vika.springit.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Long> {
    Optional<User> findByEmail(String email);

    Optional<User> findByEmailAndActivationCode(String Email, String activationCode);
}
