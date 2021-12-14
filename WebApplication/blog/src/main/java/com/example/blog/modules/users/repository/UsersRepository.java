package com.example.blog.modules.users.repository;

import com.example.blog.modules.users.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users,Long> {
    Users findByEmail(String email);  //select * from Users where email = "....."

}
