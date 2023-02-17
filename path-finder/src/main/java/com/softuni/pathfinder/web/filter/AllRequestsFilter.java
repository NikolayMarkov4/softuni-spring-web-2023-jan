package com.softuni.pathfinder.web.filter;


import com.softuni.pathfinder.helpers.LoggedUser;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;

@Component
public class AllRequestsFilter extends HttpFilter {
    private final LoggedUser loggedUser;
    private final static List<String> ALLOWED_URLS = List.of("/register", "/login", "/");


    @Autowired
    public AllRequestsFilter(LoggedUser loggedUser) {
        this.loggedUser = loggedUser;
    }

    @Override
    protected void doFilter(HttpServletRequest request,
                            HttpServletResponse response,
                            FilterChain chain) throws IOException, ServletException {
        String currentUrl = request.getRequestURL().toString();

        // TODO: if not in ALLOWED_URL and it is not internal request

//        if (loggedUser.getId() == null && ALLOWED_URLS.contains(currentUrl)) {
//            chain.doFilter(request, response);
//            return;
//        }

        // TODO: redirect to login

        super.doFilter(request, response, chain);
    }
}