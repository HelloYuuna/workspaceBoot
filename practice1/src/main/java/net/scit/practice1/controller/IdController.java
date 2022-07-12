package net.scit.practice1.controller;

/**
 * projectName     :practice1
 * fileName        :IdController
 * author          :yuuna
 * since           :2022/07/06
 */

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

@Slf4j
@Controller
public class IdController {

    @GetMapping("/prac/identifier")
    public String identifier() {
        return "/id/identifier";                        //return 은 분류한 폴더위치로 따라감
    }

    @PostMapping("/prac/idResult")
    public String idResult(String usrname, String myId, Model model) {
        log.info("유저아이디, 주민번호" + usrname + myId);
        /* 날짜 생성 */
//        근래에는 지양하는 Calendar 와 Date 객체
//        Calendar calendar = Calendar.getInstance();
//        int year = calendar.get(Calendar.YEAR);
        /* 현재 년도 */
        LocalDate ld = LocalDate.now();
        int year = ld.getYear();
        log.info("year" + year);

        /* 주민번호 자리수 */
        if (myId.length() != 14) {              // - 포함 14자리
            return "redirect:/id/identifier";
        }

        /* - 포함 체크 */
        if (myId.indexOf("-") != 6) {           // 6번째 자리에 -가 없다면
            return "redirect:/id/identifier";
        }

        /* 성별 체크 */
        char gender = myId.charAt(7);           // 0부터 카운트
        if (gender < '1' || gender > '4') {
            return "redirect:/id/identifier";
        }

        /* 생년월일 뽑기 */

        return "/id/idResult";
    }
}
