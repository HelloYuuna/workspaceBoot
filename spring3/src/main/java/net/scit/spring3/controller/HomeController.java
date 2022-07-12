package net.scit.spring3.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * projectName     :spring3
 * fileName        :HomeController
 * author          :yuuna
 * since           :2022/07/12
 */
@Slf4j
@Controller
public class HomeController {
    @GetMapping({"","/"})
    public String home() {
        return "/home";
    }
}
