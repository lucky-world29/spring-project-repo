package com.soul.demoproject1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.soul.demoproject1.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
}