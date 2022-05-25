package web.service;

import web.model.User;

import java.util.List;

public interface UserService {

    void addUser(User user);

    User getUser(long id);

    void updateUser(User user);

    void deleteUser(User user);

    List<User> getUsersList();
}
