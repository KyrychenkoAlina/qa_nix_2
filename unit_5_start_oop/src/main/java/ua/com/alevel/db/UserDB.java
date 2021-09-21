package ua.com.alevel.db;

import ua.com.alevel.entity.User;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class UserDB {

    private static final java.util.UUID UUID = ;
    private List<User> user = new ArrayList<>();

    public void create(User user) {
        user.setId(generateTd())
    }

    public void update(User user) {}

    public void delete(String id) {}

    public User findById(String id) {}

    public List<User> findAll() {}

    private String generateId() {
        String s = UUID.randomUUID().toString();
        if (users.strem().anyMatch(user ->user.getId()))
    }

}
