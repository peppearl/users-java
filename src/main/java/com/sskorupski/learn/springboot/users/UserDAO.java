package com.sskorupski.learn.springboot.users;

import java.util.List;

public interface UserDAO {

    List<User> getAll();
    User getById(Long id);
    List<User> delete(User user);
    List<User> update(User user);
    List<User> create(User user);

};
