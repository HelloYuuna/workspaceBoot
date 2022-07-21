package net.softsociety.spring5.controller;

import lombok.extern.slf4j.Slf4j;
import net.softsociety.spring5.domain.Member;
import net.softsociety.spring5.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * projectName     :spring5
 * fileName        :MemberController
 * author          :yuuna
 * since           :2022/07/21
 */

@Slf4j
@RequestMapping("/member")
@Controller
public class MemberController {

    @Autowired
    private MemberService service;

    @GetMapping("/join")
    public String intoJoin(Model model) {
        model.addAttribute("member", new Member());

        return "join";
    }


    @PostMapping("/join")
    public String result(Member member) {
        log.debug("입력받은 값: " + member);

        int res = service.insertUser(member);
        if ( res != 1 ) {
            log.debug("데이터 입력 실패");
        }

        return "redirect:/";
    }

}
