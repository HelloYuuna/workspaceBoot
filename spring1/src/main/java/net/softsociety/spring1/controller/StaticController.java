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

    @GetMapping({"/image"})        //폴더 취급
    public String image() {
        return "image";             //실제저장위치 : templates안
    }
}
