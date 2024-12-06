package com.app.test24.controller;

import com.app.test24.entity.User;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class FirstControllerForTesting {

    @GetMapping("/getTestController")
    public String getStr(HttpServletRequest request, HttpServletResponse response) {
        System.out.println("GET HEADER: " + request.getHeader("User-Agent"));
        Cookie[] cookies = request.getCookies();

        for (Cookie cookie : cookies) {
            if ("JSESSIONID".equals(cookie.getName())) {
                System.out.println("JSESSIONID: " + cookie.getValue());
            }
            System.out.println("Cookie: " + cookie.getValue());
        }
        System.out.println("STATUS: " + response.getStatus());
        return "HELLO";
    }
}