package com.softuni.pathfinder.web.controllers;

import com.softuni.pathfinder.domain.dto.binding.RouteAddForm;
import com.softuni.pathfinder.service.RouteService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;

@Controller
@RequestMapping("/routes")
public class RouteController extends BaseController {
    private final RouteService routeService;

    @Autowired
    public RouteController(RouteService routeService) {
        this.routeService = routeService;
    }

    @GetMapping
    public ModelAndView getAllRoutes(ModelAndView modelAndView) {
        return super.view("routes",
                modelAndView.addObject("routes", this.routeService.getAllRoutesPartialViews()));
    }

    @GetMapping("/add")
    public ModelAndView getAdd(ModelAndView modelAndView) {
        return super.view("add-route", modelAndView);
    }

    @PostMapping("/add")
    public ModelAndView postAdd(@Valid RouteAddForm routeAddForm,
                                BindingResult bindingResult,
                                ModelAndView modelAndView) throws IOException {
        if (bindingResult.hasErrors()) {
            return super.view("add-route",
                    modelAndView.addObject(routeAddForm));
        }

        this.routeService.addNewRoute(routeAddForm);

        return super.view("redirect:/routes");
    }

    @GetMapping("/{id}")
    public ModelAndView getById(@PathVariable Long id,
                                ModelAndView modelAndView) {
        return super.view("route-details",
                modelAndView.addObject("route", this.routeService.findById(id)));
    }

    @GetMapping("/byType/{type}")
    public ModelAndView getAllByType(@PathVariable String type,
                                     ModelAndView modelAndView) {
        return super.view("route-by-type",
                modelAndView.addObject("routes", this.routeService.findAllByCategoryName(type)));
    }

    // ModelAttributes
    @ModelAttribute(name = "routeAddForm")
    public RouteAddForm initCategoryAddForm() {
        return new RouteAddForm();
    }
}
