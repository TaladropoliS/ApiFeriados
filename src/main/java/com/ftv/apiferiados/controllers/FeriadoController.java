package com.ftv.apiferiados.controllers;

import com.ftv.apiferiados.models.services.FeriadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FeriadoController {

    @Autowired
    private FeriadoService feriadoService;

    @GetMapping("/")
    public String getFeriados(Model model) {
        model.addAttribute("titulo", "API Feriados 2024");
        model.addAttribute("feriados", feriadoService.getFeriados());
        return "index";
    }

    @GetMapping("/error")
    public String error() {
        return "error";
    }
}
