package com.codegym.login.model;

import java.util.ArrayList;
import java.util.List;

public class UserDao {
    private static List<User> users;

    static {
        users = new ArrayList<>();
        User u1 = new User();
        u1.setAge(25);
        u1.setName("Duong");
        u1.setAccount("duong");
        u1.setEmail("duong@gmail.com");
        u1.setPassword("123456");
        users.add(u1);

        User u2 = new User();
        u2.setName("Phi");
        u2.setAge(27);
        u2.setEmail("phi@gmail.com");
        u2.setAccount("phi");
        u2.setPassword("123456");

        User u3 = new User();
        u3.setName("Thuan");
        u3.setAge(24);
        u3.setEmail("thuan@gmail.com");
        u3.setAccount("thuan");
        u3.setPassword("123456");
    }

    public static User checkLogin(Login login) {
        for (User u : users) {
            if (u.getAccount().equals(login.getAccount())
                    && u.getPassword().equals(login.getPassword())) {
                return u;
            }
        }
        return null;
    }
}
