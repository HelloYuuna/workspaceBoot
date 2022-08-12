package net.softsociety.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * projectName     :web
 * fileName        :HomeController
 * author          :yuuna
 * since           :2022/08/08
 */

@Controller
public class HomeController {

    @GetMapping({"","/"})
    public String home() {
        return "home";
    }
}
