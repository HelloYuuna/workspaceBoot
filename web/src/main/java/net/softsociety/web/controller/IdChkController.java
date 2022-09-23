package net.softsociety.web.controller;

import lombok.extern.slf4j.Slf4j;
import net.softsociety.web.domain.Member;
import net.softsociety.web.service.IdChkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * projectName     :web
 * fileName        :IdDuplicate
 * author          :yuuna
 * since           :2022/08/19
 */

@Controller
@RequestMapping("/ajax")
@Slf4j
public class IdChkController {

    @Autowired
    private IdChkService service;

    @GetMapping("/idDuplicate")
    public String idChk(Model model) {

        model.addAttribute("member", new Member());

        return "/ajView/idChk";
    }

    @PostMapping("/join")
    public String insertMember(Member member) {
        log.debug("받아온 멤버값: {}", member);

        int res = service.insertMember(member);
        if ( res < 1 ) {
            log.debug("회원가입 실패");

        } else {
            log.debug("회원가입 완료");
        }

        return "redirect:/ajax/idDuplicate";
    }

}
