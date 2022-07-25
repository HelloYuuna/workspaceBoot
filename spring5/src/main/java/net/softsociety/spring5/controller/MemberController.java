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

    /* 회원가입 폼 */
    @GetMapping("/join")
    public String intoJoin(Model model) {
        model.addAttribute("member", new Member());

        return "join";
    }

    /* 회원가입 폼 > 상위로 이동 */
    @PostMapping("/join")
    public String result(Member member) {
        log.debug("입력받은 값: " + member);               // 여기까진 들어옴

        int res = service.insertUser(member);           //DB 에 안들어감 널포인터익셉션
        if ( res != 1 ) {
            log.debug("데이터 입력 실패");
        }

        return "redirect:/";
    }

    /* id체크 창 */
    @GetMapping("/idChk")
    public String idChk() {

        return "/idChk";
    }

    /* id체크 창 > 아이디 중복체크 결과 */
    @PostMapping("/idChk")
    public String idChk(String serchId, Model model) {
        log.debug("검색 ID : {}", serchId);

        // ID search
        boolean result = service.idChk(serchId);
        if(!result) {
            log.debug("찾기 실패");
        }

        log.debug("idChk: {}", result);
        model.addAttribute("searchId", serchId);
        model.addAttribute("result", result);

        return "/idChk";
    }

    @GetMapping("/loginForm")
    public String loginForm() {
        return "loginForm";
    }
}
