package CRUD.DAO;

import CRUD.model.User;

import java.util.List;

public interface UserServiceDAO {

    void addUser(User user);

    User getUser(Long id);

    void updateUser(User user);

    void deleteUser(User user);

    List<User> getUsersList();
}
