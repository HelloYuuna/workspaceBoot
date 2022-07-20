package net.softsociety.practice2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * projectName     :practice2
 * fileName        :HomeControllr
 * author          :yuuna
 * since           :2022/07/19
 */
@Controller
public class HomeController {

    @GetMapping({"","/"})
    public String home() {
        return "home";
    }
}
