package com.sskorupski.learn.springboot.users;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

// L’annotation déclare que la classe contient des endpoint
@RestController
@RequestMapping("users")
@AllArgsConstructor
public class UsersController {

    private final UserService userService;

    @GetMapping(value = "/")
    public List<User> getAll() {
        return userService.getAll();
    }

    @GetMapping(value = "/:id")
    public User getById(Long id) {
        return userService.getById();
    }

    @GetMapping(value = "/delete/:id")
    boolean delete(User user) {
        return userService.delete();
    }

    @GetMapping(value = "/update/:id")
    boolean update(User user) {
        return userService.update();
    }

    @GetMapping(value = "/create")
    Long create(User user) {
        return userService.create();
    }

}
