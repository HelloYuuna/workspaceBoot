package net.softsociety.spring2.controller;

/**
 * projectName     :spring2
 * fileName        :HomeController
 * author          :yuuna
 * since           :2022/07/05
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping({"","/"})
    public String home() {
        return "home";
    }
}
