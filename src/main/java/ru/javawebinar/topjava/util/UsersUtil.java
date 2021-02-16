package ru.javawebinar.topjava.util;

import ru.javawebinar.topjava.model.Role;
import ru.javawebinar.topjava.model.User;

import java.util.Arrays;
import java.util.List;

public class UsersUtil {
    public static final List<User> users = Arrays.asList(
            new User("IgorekAdmin", "igsap@rambler.ru", "123", Role.ADMIN, Role.USER),
            new User("Вячеслав Волоебов", "vv1972@gmail.com", "040e614b", Role.USER)
            );
}
