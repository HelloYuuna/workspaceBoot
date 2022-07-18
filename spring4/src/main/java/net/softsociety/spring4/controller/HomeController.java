package net.softsociety.spring4.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * projectName     :spring4
 * fileName        :HomeController
 * author          :yuuna
 * since           :2022/07/18
 */

@Controller
public class HomeController {

    @GetMapping({"","/"})
    public String home() {
        return "home";
    }
}


