package com.example.blog.modules.users.service;

import com.example.blog.modules.users.entity.Users;
import com.example.blog.modules.users.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersService {

    private UsersRepository usersRepository;
    @Autowired
    public UsersService(UsersRepository usersRepository){
        this.usersRepository = usersRepository;
    }

    //اضافه کردن یوزر
    public Users registerUser(Users users){
        return this.usersRepository.save(users);
    }


    //نمایش تمام یوزرها
    public List<Users> findAllUsers(){
        return this.usersRepository.findAll();
    }

}
