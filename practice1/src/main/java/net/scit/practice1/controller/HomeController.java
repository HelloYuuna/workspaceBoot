package net.scit.practice1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * projectName     :practice1
 * fileName        :HomeController
 * author          :yuuna
 * since           :2022/07/06
 */

@Controller
public class HomeController {

    @GetMapping({"","/"})
    public String home() {
        return "home";
    }
}
