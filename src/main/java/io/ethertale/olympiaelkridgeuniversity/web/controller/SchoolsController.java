package io.ethertale.olympiaelkridgeuniversity.web.controller;

import io.ethertale.olympiaelkridgeuniversity.schools.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/schools")
public class SchoolsController {

    private final SchoolService schoolService;

    @Autowired
    public SchoolsController(SchoolService schoolService) {
        this.schoolService = schoolService;
    }

    @GetMapping
    public ModelAndView schools(){
        ModelAndView mav = new ModelAndView("schools");
        mav.addObject("schools", schoolService.getAllSchools());
        return mav;
    }
}
