package net.scit.practice1.controller;

/**
 * projectName     :practice1
 * fileName        :IdController
 * author          :yuuna
 * since           :2022/07/06
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class IdController {


    @GetMapping("/prac/identifier")
    public String identifier() {
        return "id/identifier";                        //return 은 분류한 폴더위치로 따라감
    }

    @PostMapping("/prac/idResult")
    public String idResult() {

        return "id/idResult";
    }
}
