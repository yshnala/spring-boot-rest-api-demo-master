package com.foya.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.foya.demo.model.User;

/**
 * The interface User repository.
 *
 * @author Alan Huang
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {}
