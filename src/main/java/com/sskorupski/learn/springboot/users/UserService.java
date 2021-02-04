package com.sskorupski.learn.springboot.users;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserService {

    private final UserDAO userDAO;

    public List<User> getAll() {
        return userDAO.getAll();
    }
    public User getById(Long id){
        return  userDAO.getById();
    }
    boolean delete(User user){
        return  userDAO.delete();
    }
    boolean update(User user){
        return  userDAO.update();
    }
    Long create(User user) {
        return  userDAO.create();
    }

}
