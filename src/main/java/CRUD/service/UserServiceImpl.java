package CRUD.service;

import CRUD.DAO.UserServiceDAO;
import CRUD.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserServiceDAO userServiceDAO;

    @Override
    public void addUser(User user) {
        userServiceDAO.addUser(user);
    }

    @Override
    public User getUser(long id) {
        return userServiceDAO.getUser(id);
    }

    @Override
    public void updateUser(User user) {
        userServiceDAO.updateUser(user);
    }

    @Override
    public void deleteUser(User user) {
        userServiceDAO.deleteUser(user);
    }

    @Override
    public List<User> getUsersList() {
        return userServiceDAO.getUsersList();
    }
}
