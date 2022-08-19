package net.softsociety.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * projectName     :web
 * fileName        :IdDuplicate
 * author          :yuuna
 * since           :2022/08/19
 */

@Controller
@RequestMapping("/ajax")
public class IdChkController {

    @GetMapping("/idDuplicate")
    public String idChk() {
        return "/ajView/idChk";
    }
}
