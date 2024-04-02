package com.narainox.mailSchedulerApplication.repository;

import com.narainox.mailSchedulerApplication.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
