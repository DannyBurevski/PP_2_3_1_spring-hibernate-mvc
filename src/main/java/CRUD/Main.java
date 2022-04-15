//package CRUD;
//
////import CRUD.Config.AppConfig;
//import CRUD.Config.PersistenceConfig;
//import CRUD.model.Gender;
//import CRUD.model.User;
//import CRUD.service.UserService;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.stereotype.Component;
//
//
//public class Main {
//    public static void main(String[] args) {
//        AnnotationConfigApplicationContext context =
//                new AnnotationConfigApplicationContext(PersistenceConfig.class);
//
//        UserService userService = context.getBean(UserService.class);
////UserService userService = new UserServiceImpl();
//
//        userService.addUser(new User("Ivanov", "Petr", Gender.male));
//        userService.addUser(new User("Ivanova", "Dasha", Gender.female));
////        userService.addUser(new User("Petrov", "Sergey", Gender.male));
////        userService.addUser(new User("Sergeev", "Andrey", Gender.male));
////        userService.addUser(new User("Andreev", "Grigoriy", Gender.male));
//        User us = userService.getUser(502);
//        System.out.println(us);
//        us.setLastName(us.getLastName() + "#");
//        System.out.println(us);
//        userService.updateUser(us);
//        System.out.println(userService.getUser(2));
//        userService.deleteUser(userService.getUser(1));
//
//    }
//}
