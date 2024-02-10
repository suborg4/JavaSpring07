package ru.suborg.java_spring_07.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Контроллер для обработки различных страниц приложения.
 */
@Controller
public class AppController {

    /**
     * Домашняя страница.
     * @return Представление домашней страницы.
     */
    @GetMapping("/")
    public String home(){
        return "home";
    }

    /**
     * Публичная страница для обычных пользователей.
     * @return Представление публичной страницы.
     */
    @GetMapping("/public-data")
    public String userPage(){
        return "public_page";
    }

    /**
     * Приватная страница для администраторов.
     * @return Представление доступное только аутентифицированным пользователям.
     */
    @GetMapping("/private-data")
    public String adminPage(){
        return "private_page";
    }

    /**
     * Страница отказа в доступе.
     * @return Представление отказа в доступе.
     */
    @GetMapping("/access-denied")
    public String accessDenied(){
        return "access-denied";
    }

    /**
     * Страница аутентификации.
     * @return Представление аутентификации.
     */
    @GetMapping("/login")
    public String auth(){
        return "login-page";
    }
}
