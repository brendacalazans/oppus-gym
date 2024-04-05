package br.com.oppus.oppus.controller;


import jakarta.inject.Inject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.persistence.EntityManager;

@Controller
public class DashboardController {

    @GetMapping("/dashboard.html")
    public String dashboard() {
        return "dashboard";
    }
}