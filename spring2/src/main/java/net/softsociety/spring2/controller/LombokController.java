package net.softsociety.spring2.controller;

import lombok.extern.slf4j.Slf4j;
import net.softsociety.spring2.controller.vo.Member;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * projectName     :spring2
 * fileName        :LombokController
 * author          :yuuna
 * since           :2022/07/08
 */
@Slf4j                          //log 사용 클래스
@Controller
public class LombokController {

    @GetMapping("/log/lombok")
    public String lombok() {
        Member member = new Member();
        member.setId("aaa");
        System.out.println(member);
        member.test();
        return "redirect:/";
    }

    /**
     * + 기호를 사용하여 문자열과 합쳐 사용
     * {변수명}으로 값을 찍음
     * 로깅 레벨은 프로퍼티에서 설정
     * @return redirect
     */
    @GetMapping("/log/logger")
    public String logger() {
        log.error("Error!" +100);
        log.warn("Warn! {}, {}","aaa", 111);
        log.info("info");
        log.debug("debug");
        log.trace("trace");

        return "redirect:/";
    }
}
