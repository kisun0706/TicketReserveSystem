package com.ticket_reserve_system.java.study.common.user.repository;

import com.ticket_reserve_system.java.study.common.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
}
