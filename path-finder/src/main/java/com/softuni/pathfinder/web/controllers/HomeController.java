package com.softuni.pathfinder.web.controllers;

import com.softuni.pathfinder.domain.dto.view.RoutePartialViewModel;
import com.softuni.pathfinder.service.RouteService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/") // localhost:8080/ -> all types of requests
public class HomeController extends BaseController {
    private static final String USERNAME_SESSION_KEY = "username";
    private final RouteService routeService;

    @Autowired
    public HomeController(RouteService routeService) {
        this.routeService = routeService;
    }

    @GetMapping // localhost:8080 -> get request
    public ModelAndView getHome(ModelAndView modelAndView, HttpSession httpSession) {
        final String username = httpSession.getAttribute(USERNAME_SESSION_KEY) != null
                ? httpSession.getAttribute(USERNAME_SESSION_KEY).toString()
                : "";

        final RoutePartialViewModel mostCommented = routeService.getMostCommented();

        modelAndView.addObject("mostCommented", mostCommented);
        modelAndView.addObject(USERNAME_SESSION_KEY, username);

        return super.view("index", modelAndView);
    }

    @GetMapping("about")
    public ModelAndView getAbout() {
        return super.view("about");
    }
}
