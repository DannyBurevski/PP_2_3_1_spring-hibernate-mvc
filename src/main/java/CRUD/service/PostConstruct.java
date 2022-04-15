package CRUD.service;


import CRUD.model.Gender;
import CRUD.model.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Component
public class PostConstruct {
    @Autowired
    private UserService userService;

    @javax.annotation.PostConstruct
    public void init() {
//        AnnotationConfigApplicationContext context =
//                new AnnotationConfigApplicationContext(PersistenceConfig.class);

        userService.addUser(new User("Ivan", "Petrov", Gender.male, "+79050987654", "ivan@mail.ru"));
        userService.addUser(new User("Petr", "Olgin", Gender.male, "+79031234567", "petr@mail.ru"));
        userService.addUser(new User("Olga", "Igoreva", Gender.female, "+79265545544", "olga@mail.ru"));
        userService.addUser(new User("Igor", "Alinov", Gender.male, "+79234446688", "igor@mail.ru"));
        userService.addUser(new User("Alina", "Ivanova", Gender.female, "+74957772211", "alina@mail.ru"));

        User user6 = userService.getUser(1);
        user6.setFirstName("GGGGGGGG");
        userService.updateUser(user6);
        userService.updateUser(new User("Ivan", "Petrov", Gender.male, "+79050987654", "ivan@mail.ru"));

//userService.getUsersList().forEach(System.out::println);
    }


}
