package com.example.datepicker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * projectName     :datepicker
 * fileName        :DatePickerHome
 * author          :yuuna
 * since           :2022/09/23
 */
@Controller
public class DatePickerHome {

    @GetMapping({"","/"})
    public String home() {
        return "/datepicker";
    }
}
