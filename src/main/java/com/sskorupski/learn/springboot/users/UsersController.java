package com.sskorupski.learn.springboot.users;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// L’annotation déclare que la classe contient des endpoint
@RestController
@RequestMapping("users")
@AllArgsConstructor
public class UsersController {

    private final UserService userService;

    //GET localhost/users/
    @GetMapping(value = "/")
    public List<User> getAll() {
        return userService.getAll();
    }

    //GET localhost/users/{id}
    @GetMapping(value = "/{id}")
    public List<User> getById(@PathVariable Long id) {
        return userService.getAll();
    }

    @DeleteMapping(value = "/delete/{id}")
    public List<User> delete(@PathVariable Long id) {
        return userService.getAll();
    }

    @GetMapping(value = "/update/{id}")
    public List<User> update(@PathVariable Long id) {
        return userService.getAll();
    }

    @GetMapping(value = "/create")
    public List<User> create(User user) {
        return userService.getAll();
    }

}
