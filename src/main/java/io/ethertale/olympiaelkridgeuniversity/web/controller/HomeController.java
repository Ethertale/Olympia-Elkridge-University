package io.ethertale.olympiaelkridgeuniversity.web.controller;

import io.ethertale.olympiaelkridgeuniversity.schools.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class HomeController {

    private final SchoolService schoolService;

    @Autowired
    public HomeController(SchoolService schoolService) {
        this.schoolService = schoolService;
    }

    @GetMapping
    public ModelAndView home() {
        ModelAndView mav = new ModelAndView("main");
        mav.addObject("LawBranches", schoolService.getAllLawBranches());
        return mav;
    }
}
