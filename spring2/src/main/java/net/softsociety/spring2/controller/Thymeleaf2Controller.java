package net.softsociety.spring2.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * projectName     :spring2
 * fileName        :Thymeleaf2Controller
 * author          :yuuna
 * since           :2022/07/12
 */

@Slf4j
@RequestMapping("/th")
@Controller
public class Thymeleaf2Controller {

    @GetMapping("/thymeleaf2")
    public String thymeleaf2(Model model) {
        String str = "문자열";
        model.addAttribute("str", str);

        String values = "Java, HTML, CSS";
        model.addAttribute("values", values);

        ArrayList<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        model.addAttribute("list", list);

        HashMap<String, Object> map = new HashMap<>();
        map.put("name", "키보드");
        map.put("price", "10000");
        model.addAttribute("map", map);

        int num = 1;
        model.addAttribute("num", num);

        return "/thview/thymeleaf2";
    }
}
