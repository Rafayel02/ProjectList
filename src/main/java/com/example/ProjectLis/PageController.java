package com.example.ProjectLis;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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
    public String getListPage() {
        return "list-page";
    }

}
