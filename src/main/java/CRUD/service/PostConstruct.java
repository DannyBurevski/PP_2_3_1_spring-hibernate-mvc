package CRUD.service;

import CRUD.model.Gender;
import CRUD.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PostConstruct {
    @Autowired
    private UserService userService;

    @javax.annotation.PostConstruct
    public void init() {
        userService.addUser(new User("Иван", "Петров", Gender.male, "+79050987654", "ivan@mail.ru"));
        userService.addUser(new User("Петр", "Ольгин", Gender.male, "+79031234567", "petr@mail.ru"));
        userService.addUser(new User("Ольга", "Игорева", Gender.female, "+79265545544", "olga@mail.ru"));
        userService.addUser(new User("Игорь", "Алимов", Gender.male, "+79234446688", "igor@mail.ru"));
        userService.addUser(new User("Алина", "Аревадзе", Gender.female, "+74957772211", "alina@mail.ru"));
    }


}
