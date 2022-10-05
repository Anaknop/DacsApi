package br.univille.dacs2022.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class MainController {

    @GetMapping
    public ModelAndView index() {
        var msg = "Seja bem-vindo!";
        return new ModelAndView("home/index", "msgnatela", msg);
    }
}