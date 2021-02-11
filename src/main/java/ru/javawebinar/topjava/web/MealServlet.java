package ru.javawebinar.topjava.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.javawebinar.topjava.util.Crud;
import ru.javawebinar.topjava.util.MealsUtil;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class MealServlet extends HttpServlet {
    private Crud crud;
    private final int caloriesPerDay = 2000;

    public MealServlet() {
        super();
        crud = new Crud();
    }

    private static final Logger log = LoggerFactory.getLogger(MealServlet.class);

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        log.debug("forward to meals");
        String action = request.getParameter("action");
        if (action == null) {
            request.setAttribute("mealsTo", MealsUtil.filteredByStreams(crud.getMeals(), LocalTime.MIN, LocalTime.MAX, caloriesPerDay));
            request.getRequestDispatcher("/meals.jsp").forward(request, response);
        } else {
            int index = Integer.parseInt(request.getParameter("index"));
            log.debug("delete meal index " + index);
            crud.delete(index);
            if (action.equalsIgnoreCase("delete")) {
                response.sendRedirect("/topjava/meals");
            } else {
                request.getRequestDispatcher("editmeal.jsp").forward(request, response);
            }
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        String date = req.getParameter("datetime");
        DateTimeFormatter formatter = DateTimeFormatter.ISO_DATE_TIME;
        LocalDateTime datetime = LocalDateTime.parse(date, formatter);
        String description = req.getParameter("description");
        int calories = Integer.parseInt(req.getParameter("calories"));
        crud.add(datetime, description, calories);
        resp.sendRedirect("/topjava/meals");
    }
}

