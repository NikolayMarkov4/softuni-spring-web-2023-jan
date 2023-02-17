package com.softuni.pathfinder.web;

import com.softuni.pathfinder.domain.dto.binding.UserLoginForm;
import com.softuni.pathfinder.domain.dto.binding.UserRegisterForm;
import com.softuni.pathfinder.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/auth")
public class AuthController extends BaseController {

    private final UserService userService;

    @Autowired
    public AuthController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/register")
    public ModelAndView getRegister(ModelAndView modelAndView) {

//        modelAndView.addObject("userRegisterInfo", userRegisterForm);

        return super.view("register", modelAndView);
    }


    @ModelAttribute("userRegisterForm")
    public UserRegisterForm initForm() {
        return new UserRegisterForm();
    }

    @PostMapping("/register")
    public ModelAndView doRegister(@Validated UserRegisterForm userRegisterForm,
                                   BindingResult bindingResult,
                                   ModelAndView modelAndView) {

        // In our redirect implementation we are returning brand new Model and View and that was resetting the page.
        // This is why we weren't seeing any error on our screen
//        if (bindingResult.hasErrors()) {
//            redirectAttributes.addFlashAttribute("userRegisterForm", userRegisterForm)
//                    .addFlashAttribute("org.springframework.validation.BindingResult.userRegisterForm", bindingResult);
//
//            return super.redirect("register");
//        }
        if (bindingResult.hasErrors()) {
            return super.view("register", modelAndView.addObject(userRegisterForm));
        }

        this.userService.registerUser(userRegisterForm);

        return super.redirect("register");
    }

    @GetMapping("/login")
    public ModelAndView getLogin() {
        return super.view("login");
    }

    @PostMapping("/login")
    public ModelAndView postLogin(UserLoginForm userLoginForm) {
        return this.userService.loginUser(userLoginForm).isValid()
                ? super.redirect("/")
                : super.redirect("login");
    }

    @GetMapping("/logout")
    public ModelAndView postLogout() {
        this.userService.logout();
        return super.redirect("/");
    }
}
