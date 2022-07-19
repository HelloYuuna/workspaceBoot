package net.softsociety.spring4.controller;

import lombok.extern.slf4j.Slf4j;
import net.softsociety.spring4.service.GuestService;
import net.softsociety.spring4.vo.Guest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * projectName     :spring4
 * fileName        :BoardController
 * author          :yuuna
 * since           :2022/07/18
 */

@Slf4j
@Controller
@RequestMapping("/board")
public class BoardController {

    @Autowired
    private GuestService service;

    /**
     * 방명록1
     * @param model VO전달
     * @param guest VO가져옴
     * @return 메인페이지1
     */
    @GetMapping("/main1")
    public String boardMain(Model model, Guest guest) {
        ArrayList<Guest> guests = service.selectAll(guest);

        if (guests.isEmpty()) {
            log.debug("데이터 없음");
        }

        log.info("수집한 데이터: " + guests);

        model.addAttribute("guests",guests);

        return "main1";
    }

    @GetMapping("/main2")
    public String boardMain2(Model model, Guest guest) {
        ArrayList<Guest> guests = service.selectAll(guest);

        if (guests.isEmpty()) {
            log.debug("데이터 없음");
        }

        log.info("수집한 데이터: " + guests);

        model.addAttribute("guests",guests);

        return "main2";
    }

    /**
     * delete page
     * @return boardList page
     */
    @PostMapping("/delete")
    public String boardDelete(int num, String password) {
        log.info("번호, 비밀번호 " + num + ", " + password);

        Guest guest = new Guest();
        guest.setNum(num);
        guest.setPassword(password);
        int result = service.deleteGuest(guest);
        if (result != 1) {
            log.debug("일치하는 데이터가 없음");
            return "redirect:/";
        }

        log.info("삭제완료");
        return "redirect:/board/main1";
    }

    /**
     * 방명록 글쓰기 폼 이동
     * @return boardList page
     */
    @GetMapping("/boardInsert")
    public String boardInsert() {

        return "boardInsert";
    }

    /**
     * Insert Into
     * @param guest VO
     * @return 게시판 메인페이지
     */
    @PostMapping("/write")
    public String write(Guest guest) {
        log.info("Guestinfo:" + guest);
        int result = service.insertGuest(guest);

        if (result != 1) {
            log.debug("데이터 입력 실패");
            return "redirect:/";
        }

        return "redirect:/board/main1";
    }
}
