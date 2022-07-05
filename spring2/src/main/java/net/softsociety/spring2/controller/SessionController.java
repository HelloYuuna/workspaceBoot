package net.softsociety.spring2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;

/**
 * projectName     :spring2
 * fileName        :SessionController
 * author          :yuuna
 * since           :2022/07/05
 */

@Controller
public class SessionController {

    @GetMapping("/ss/session1")
    public String session1(HttpSession session) {
        session.setAttribute("id", "abc");  //session 에 저장
        return "redirect:/";
    }

    @GetMapping("/ss/session2")
    public String session2(HttpSession session) {
        session.removeAttribute("id");          //session 에 저장한 id를 삭제
        return "redirect:/";
    }

    @GetMapping("/ss/session3")
    public String session3() {
        return "session";
    }

    @GetMapping("/ss/session4")
    public String session4(HttpSession session) {
        String id = (String) session.getAttribute("id");
        //NullPointerExcept 방지를 위해 반드시 && 앞에 null 값 체크가 필수
        if(id != null && id.equals("abc")) {
            return "session4";
        }
//        if(session.getAttribute("id") != null && session.getAttribute("id").equals("abc")){
//            return "session4";
//        }
        return "redirect:/";
    }
}
