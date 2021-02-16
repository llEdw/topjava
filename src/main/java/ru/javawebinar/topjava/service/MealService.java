package ru.javawebinar.topjava.service;

import ru.javawebinar.topjava.model.Meal;
import ru.javawebinar.topjava.model.User;
import ru.javawebinar.topjava.repository.MealRepository;
import ru.javawebinar.topjava.util.exception.NotFoundException;
import ru.javawebinar.topjava.web.SecurityUtil;

import java.util.List;

import static ru.javawebinar.topjava.util.ValidationUtil.checkNotFoundWithId;

public class MealService {

//    private MealRepository repository;
//    int authUserId = SecurityUtil.authUserId();

//    public MealService(MealRepository repository) {
//        this.repository = repository;
//    }

//    public Meal create(Meal meal) {
//        if (authUserId == meal.getUserId()) {
//            throw new NotFoundException("create, authUserId is not equal to UserId");
//        } else {
//            return repository.save(authUserId, meal);
//        }
//    }

//    public void delete(int id) {
//        if (authUserId == repository.get(authUserId, id).getUserId()) {
//            throw new NotFoundException("create, authUserId is not equal to UserId");
//        } else {
//            checkNotFoundWithId(repository.delete(authUserId, id), id);
//        }
//    }

//    public Meal get(int id) {
//        if (authUserId == repository.get(authUserId, id).getUserId()) {
//            throw new NotFoundException("create, authUserId is not equal to UserId");
//        } else {
//        return checkNotFoundWithId(repository.get(authUserId, id), id);
//    }

//    public List<User> getAll() {
//        return repository.getAll();
//    }

//    public void update(User user) {
//        checkNotFoundWithId(repository.save(user), user.getId());
//    }

}