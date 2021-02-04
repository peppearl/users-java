package com.sskorupski.learn.springboot.users;

import lombok.AllArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@AllArgsConstructor
public class MysqlUserDAO implements UserDAO {

    private static class Queries {
        static final String GET_ALL = "SELECT id, username, email, password FROM users";
        static final String GET_ID = "SELECT id, username, email, password FROM users WHERE id = ?";
        static final String DELETE = "DELETE FROM users WHERE id = ?";
        static final String UPDATE = "UPDATE users SET username = ?, email = ?, password = ? WHERE id = ?";
        static final String CREATE = "INSERT INTO users (username, email, password)  VALUES (?, ?, ?)";

    }

    private final JdbcTemplate jdbcTemplate;

    @Override
    public List<User> getAll() {
        return jdbcTemplate.query(Queries.GET_ALL, new UserRowMapper());
    }
    public User getById(Long id) {
        return jdbcTemplate.query(Queries.GET_ID, new UserRowMapper());
    }
    boolean delete(User user) {
        return jdbcTemplate.query(Queries.DELETE, new UserRowMapper());
    }
    boolean update(User user) {
        return jdbcTemplate.query(Queries.UPDATE, new UserRowMapper());
    }
    Long create(User user) {
        return jdbcTemplate.query(Queries.CREATE, new UserRowMapper());
    }

}
