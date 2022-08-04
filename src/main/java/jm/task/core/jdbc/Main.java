package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Sasha", "Vasin", (byte) 20);
        userService.saveUser("Ivan", "Petrov", (byte) 23);
        userService.saveUser("Andrey", "Korolev", (byte) 40);
        userService.saveUser("Inna", "Ivanova", (byte) 18);
        System.out.println(userService.getAllUsers());
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
