package com.intento.defense.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/sobre")
    public String sobre() {
        return "sobre";
    }

    @GetMapping("/proteccion")
    public String proteccion() {
        return "proteccion";
    }

    @GetMapping("/tipos")
    public String tipos() {
        return "tipos";
    }

    @GetMapping("/testimonios")
    public String testimonios() {
        return "testimonios";
    }
}



