package com.vika.springit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * Annotation that indicates a method return value should be bound to the web
 * response body. Supported for annotated handler methods in Servlet environments.
 *
 * <p> As of version 4.0 this annotation can also be added on the type level in
 * which case it is inherited and does not need to be added on the method level.
 */

@Controller
public class HomeController {

    @GetMapping("/home")
    public String home(Model model){
        model.addAttribute("title","Hello, Thymeleaf!");
        return "home";
    }

}
