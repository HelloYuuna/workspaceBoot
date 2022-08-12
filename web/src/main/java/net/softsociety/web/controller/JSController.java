package net.softsociety.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * projectName     :web
 * fileName        :JSController
 * author          :yuuna
 * since           :2022/08/08
 */

@Controller
@RequestMapping("/js")
public class JSController {

    @GetMapping("/js1")
    public String JSHome() {
        return "/jsView/js1";
    }

    @GetMapping("/js2")
    public String JSHome2() {
        return "/jsView/js2";
    }

    @GetMapping("/js3")
    public String JSHome3() {
        return "/jsView/js3";
    }
}
