package com.himanshu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.himanshu.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByRole(@Param("role") String role);
}
