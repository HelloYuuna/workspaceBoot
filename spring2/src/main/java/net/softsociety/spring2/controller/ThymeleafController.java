package net.softsociety.spring2.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import net.softsociety.spring2.controller.vo.Member;

/**
 * projectName     :spring2
 * fileName        :ThymeleafController
 * author          :yuuna
 * since           :2022/07/08
 */

@Slf4j
@Controller
@RequestMapping("/th")              //중간 경로 공통적으로 설정, 전부 /th 아래로 경로가 설정됨
public class ThymeleafController {

    @GetMapping("thymeleaf1")
    public String thymeleaf1(Model model) {
        String str = "abcd";
        int num1 = 3;
        Member member = new Member("abc", "111-1111", "차슈", "서울시");
        String tag = "<marquee>tag가 포함된 문자열</marquee>";
        String url = "https://www.naver.com";

        /* mmodel > 메소드 객체 상수 변수 담을 수 있음 */
        model.addAttribute("str",str);
        model.addAttribute("num1",num1);
        model.addAttribute("member",member);
        model.addAttribute("tag",tag);
        model.addAttribute("url",url);

        return "/thview/thymeleaf1";
    }

    @GetMapping("thymeleaf2")
    public String thymeleaf2() {

        return "/thview/thymeleaf2";
    }
}
