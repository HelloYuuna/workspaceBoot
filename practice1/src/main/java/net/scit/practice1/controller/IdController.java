package net.scit.practice1.controller;

/**
 * projectName     :practice1
 * fileName        :IdController
 * author          :yuuna
 * since           :2022/07/06
 */

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

@Controller
public class IdController {


    @GetMapping("/prac/identifier")
    public String identifier() {
        return "id/identifier";                        //return 은 분류한 폴더위치로 따라감
    }

    @PostMapping("/prac/idResult")
    public String idResult(String name, String num, Model model) {
        System.out.println(name + ", " + num);

        /* 날짜 생성 */
//        근래에는 지양하는 Calendar 와 Date 객체
//        Calendar calendar = Calendar.getInstance();
//        int year = calendar.get(Calendar.YEAR);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");     // 날짜 서식 지정
        System.out.println(sdf.format(new Date()));

        return "id/idResult";
    }
}
