package ru.javawebinar.topjava.util;

import ru.javawebinar.topjava.model.Meal;

import java.time.LocalDateTime;
import java.util.List;

public class Crud {
    private List<Meal> meals;

    public Crud() {
        meals = MealsUtil.getList();
    }

    public List<Meal> getMeals() {
        return meals;
    }

    public synchronized void delete(int index) {
        meals.remove(index);
    }

    public synchronized void add(LocalDateTime dateTime, String description, int calories) {
        meals.add(new Meal(dateTime, description, calories));
    }
}
