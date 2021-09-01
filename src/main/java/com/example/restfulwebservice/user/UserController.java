package com.example.restfulwebservice.user;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    private UserDaoService userDaoService;

    // 의존성 주입
    public UserController(UserDaoService userDaoService){
        this.userDaoService = userDaoService;
    }

    // 전체 유저 조회
    // GET /users
    @GetMapping("/users")
    public List<User> retrieveAllUsers(){
        return userDaoService.findAll();
    }

    // 유저 생성
    // POST /users
    @PostMapping("/users")
    public void crateUser(@RequestBody User user){
        User savedUser = userDaoService.save(user);

    }

    // 특정 유저 조회
    // GET /users/1 or /users/10 -> String
    @GetMapping("/users/{id}")
    public User retrieveUser(@PathVariable int id){
        return userDaoService.findOne(id);
    }

}
