package com.example.restfulwebservice.user;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/*
* 비지니스 로직 처리
* */
@Service
public class UserDaoService {
    private static List<User> users = new ArrayList<>();
    private static int usersCount = 3;
    static {
        users.add(new User(1, "sion", new Date()));
        users.add(new User(2, "kimsu", new Date()));
        users.add(new User(3, "nike", new Date()));
    }

    // 전체 유저 조회
    public List<User> findAll() {
        return users;
    }

    // 유저 생성
    public User save(User user){
        // TODO 이름 및 데이트 값 유효성 체크
        if (user.getId() == null) {
            user.setId(++usersCount);
        }

        users.add(user);
        return user;
    }
    // 특정 유저 조회
    public User findOne(int id){
        for (User user : users) {
            if (user.getId() == id) {
                return user;
            }
        }
        return null;
    }

    // 특정 유저 삭제
    public User deleteById(int id){
        Iterator<User> iterator = users.iterator();

        while (iterator.hasNext()) {
            User user = iterator.next();
            if (user.getId() == id) {
                iterator.remove();
                return user;
            }
        }
        return null;
    }


}
