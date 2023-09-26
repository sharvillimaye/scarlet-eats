package com.scarleteats.backend.security.repository;

import com.scarleteats.backend.security.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findApplicationUserByUsername(String username);
}
