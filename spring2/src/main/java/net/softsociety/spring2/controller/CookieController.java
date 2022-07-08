package net.softsociety.spring2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

/**
 * projectName     :spring2
 * fileName        :CookieController
 * author          :yuuna
 * since           :2022/07/07
 */

@Controller
public class CookieController {

    @GetMapping("/ck/cookie1")
    public String cookie1(HttpServletResponse response) {
        System.out.println("쿠키 저장!");

        /* 쿠키 생성 */
        Cookie c1 = new Cookie("str","abcd"); // 영문(2~300자) 숫자 특수기호만 저장 가능
        Cookie c2 = new Cookie("num","123");

        /* 유지 시간 설정 */
        c1.setMaxAge(60*60*24*3);
        c2.setMaxAge(60*60*24*3);

        /* 클라이언트로 전달하여 저장 */
        response.addCookie(c1);
        response.addCookie(c2);

        return "redirect:/";
    }

    @GetMapping("/ck/cookie2")
    public String cookie2(HttpServletResponse response) {
        System.out.println("쿠키 삭제!");
        Cookie c1 = new Cookie("str",null);
        Cookie c2 = new Cookie("num",null);
        c1.setMaxAge(0);
        c2.setMaxAge(0);
        response.addCookie(c1);
        response.addCookie(c2);
        return "redirect:/";
    }

    @GetMapping("/ck/cookie3")
    public String cookie3(
            @CookieValue(name = "str", defaultValue = "없음") String str,
            @CookieValue(name = "num", defaultValue = "0") int num) {
        System.out.println("쿠키 읽기!");
        System.out.println("쿠키1" + str);
        System.out.println("쿠키2" + num);
        return "redirect:/";
    }

    /*
     * 방문횟수가 저장된 쿠키를 읽어옴
     * 없으면 방문횟수 0
     * 있으면 쿠키에 저장된 숫자가 기존 방문횟수
     * 방문횟수에 1을 더함
     * 쿠키에 증가된 방문횟수를 저장하여 클라이언트로 보냄
     * 방문 횟수를 model에 저장하여 html 페이지에서 환영 문구 출력
     */
    /* 방문횟수 */
    @GetMapping("/ck/cookie")
    public String cntByVisiting(
            @CookieValue(value = "cnt", defaultValue = "0") int cnt,
            Model model, HttpServletResponse response) {

        model.addAttribute("cnt", cnt++); //cnt에 넣고나서 ++

        Cookie cookie = new Cookie("cnt", String.valueOf(cnt));
//        Cookie cookie = new Cookie("cnt", String.valueOf(++cnt));
        cookie.setMaxAge(60*60*24*3);
        response.addCookie(cookie);

        return "/cookie";
    }

}
