package com.payroll.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.payroll.security.model.User_Role;
@Repository
public interface User_RoleRepository extends JpaRepository<User_Role, String> {

}
