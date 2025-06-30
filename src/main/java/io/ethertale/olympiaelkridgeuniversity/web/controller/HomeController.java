package io.ethertale.olympiaelkridgeuniversity.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class HomeController {

    @GetMapping
    public ModelAndView home() {
        ModelAndView mav = new ModelAndView("main");
        return mav;
    }
}
