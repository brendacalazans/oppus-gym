package br.com.oppus.oppus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("/oppus/")
    public String oppus() {
        return "oppus";
    }

    @GetMapping("/index.html/")
    public String index() {
        return "oppus";
    }
}
