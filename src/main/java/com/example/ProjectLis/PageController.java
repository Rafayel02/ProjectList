package com.example.ProjectLis;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/")
public class PageController {

    @GetMapping
    public String getStartPage() {
        return "start-page";
    }

    @GetMapping
    @RequestMapping("/preg")
    public String getPostRegistrationPage() {
        return "post-reg-page";
    }

    @GetMapping
    @RequestMapping("/list")
    public ModelAndView getListPage() {
        ModelAndView mav = new ModelAndView("list-page");
        mav.addObject("allItems", Database.getData());
        return mav;
    }

}
