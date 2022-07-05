package net.softsociety.spring1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * home 경로의 /spring1/의 image로 끝나면 image라는 html파일을 오픈
 * projectName     :spring1
 * fileName        :StaticController
 * author          :yuuna
 * since           :2022/06/30
 */
@Controller
public class StaticController {
    //현재 경로 templates
    @GetMapping({"/image"})        //폴더 취급
    public String image() {
        return "image";              //실제저장위치 : templates안
    }

    @GetMapping({"test/image2"})
    public String image2() {
        return "image2";
    }

    @GetMapping({"/css"})
    public String css() {
        return "css";
    }

    @GetMapping({"/js"})
    public String js() {
        return "js";
    }

    @GetMapping("/form")
    public String form() {
        return "form";
    }
}
