package net.softsociety.spring1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * projectName     :spring1
 * fileName        :HomeController
 * author          :yuuna
 * since           :2022/06/30
 */
@Controller                         // 연결을 시켜줌
public class HomeController {
    @GetMapping({"","/"})     // 뒤에 아무것도 없거나 혹은 / 가 붙으면 실행
    public String home() {
        /* resources - templates 에있는 home.html을 가르킴 */
        return "home";
    }
}
