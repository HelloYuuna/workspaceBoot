package net.softsociety.exam.controller;

import lombok.extern.slf4j.Slf4j;
import net.softsociety.exam.domain.Board;
import net.softsociety.exam.domain.Reply;
import net.softsociety.exam.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * projectName     :exam_market
 * fileName        :BoardRestController
 * author          :yuuna
 * since           :2022/08/23
 */

@Controller
@Slf4j
@RequestMapping("/board")
@ResponseBody
public class BoardRestController {

    @Autowired
    private BoardService service;

    // 댓글등록
    @PostMapping("/insertRpy")
    public void insertRpy(Reply reply, @AuthenticationPrincipal UserDetails user) {
        log.debug("넘어온 댓글 객체: {}", reply);
        String id = user.getUsername();
        reply.setMemberid(id);

        int res = service.insertReply(reply);
        if ( res < 1 ) {
            log.debug("댓글 등록 실패");
        }
    }

    // 댓글 전체목록
    @GetMapping("/selectRpyAll")
    public List<Reply> selectReplyAll() {
        return service.selectReplyAll();
    }

    // 아이템 찾기
    @PostMapping("/search")
    public void searchItem(Board board) {
        log.debug("받아온 값: {}", board);

//        service.selectBoardBySelectBox(board);

    }
}
