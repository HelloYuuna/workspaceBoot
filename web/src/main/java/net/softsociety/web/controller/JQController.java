package net.softsociety.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * projectName     :web
 * fileName        :JQController
 * author          :yuuna
 * since           :2022/08/11
 */

@Controller
@RequestMapping("/jq")
public class JQController {

    @GetMapping("/jq1")
    public String jq1() {
        return "/jqView/jq1";
    }

    @GetMapping("/jq2")
    public String jq2() {
        return "/jqView/jq2";
    }

    @GetMapping("/jq3")
    public String jq3() {
        return "/jqView/jq3";
    }

    @GetMapping("/jq4")
    public String jq4() {
        return "/jqView/jq4";
    }

    @GetMapping("/jq5")
    public String jqPrac() {
        return "/jqView/jq5";
    }

    @GetMapping("/jq6")
    public String jq6() {
        return "/jqView/jq6";
    }

}