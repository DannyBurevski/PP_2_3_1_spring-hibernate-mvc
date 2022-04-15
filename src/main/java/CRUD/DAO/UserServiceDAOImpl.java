package CRUD.DAO;

import CRUD.model.User;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
import javax.transaction.Transactional;
import java.util.List;

@Repository
public class UserServiceDAOImpl implements UserServiceDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void addUser(User user) {
        entityManager.persist(user);
    }

    @Override
    public User getUser(Long id) {

return (User) entityManager.find(User.class, id);
        //        try {
//            String jpql = "select u from User u where u.id = :id";
//            Query query = entityManager.createQuery(jpql);
//            query.setParameter("id", id);
//            return (User) query.getSingleResult();
//        } catch (NoResultException e) {
//            System.out.println("Пользователя с ID=" + id + " не найден");
//        } return null;
    }

    @Override
    public void updateUser(User user) {
        entityManager.merge(user);
    }

    @Override
    public void deleteUser(User user) {
        entityManager.remove(entityManager.contains(user) ? user : entityManager.merge(user));

    }

    @Override
    public List<User> getUsersList() {
        String jpql = "from User";
        Query query = entityManager.createQuery(jpql);
        return query.getResultList();
    }
}
