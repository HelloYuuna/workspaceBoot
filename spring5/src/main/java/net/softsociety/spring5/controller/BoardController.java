package net.softsociety.spring5.controller;

import lombok.extern.slf4j.Slf4j;
import net.softsociety.spring5.domain.Board;
import net.softsociety.spring5.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * projectName     :spring5
 * fileName        :BoardController
 * author          :yuuna
 * since           :2022/07/27
 */

@Controller
@Slf4j
@RequestMapping("/board")
public class BoardController {

    @Autowired
    private BoardService service;


    /**
     * 게시판 목록
     * @return list
     */
    @GetMapping("/list")
    public String boardList(Model model) {
        //DB 글 읽어오기
        List<Board> boardList = service.selectBoardList();
        log.debug("게시글 리스트: {}", boardList);

        model.addAttribute("boardList", boardList);

        return "/boardView/boardList";
    }

    /**
     * 게시글 쓰기
     * @param model board 객체를 생성해서 넘김
     * @return boardPosting
     */
    @GetMapping("/boardPosting")
    public String boardPositng(Model model) {

        model.addAttribute("board", new Board());

        return "/boardView/boardPosting";
    }

    /**
     * 게시글 작성 POST
     * @param board 작성한 게시글을 담는 객체
     * @return 게시글 리스트
     */
    @PostMapping("/list")
    public String boardList(Board board, @AuthenticationPrincipal UserDetails user) {
        // 현재 세션에 저장된 아이디
        String id = user.getUsername();
        log.debug("세션에 저장된 아이디: " + id);
        log.debug("작성한 게시글 : {}", board);

        // 세션에서 받아온 아이디를 board 객체에 저장
        board.setMemberid(id);

        int res = service.insertBoard(board);
        if ( res < 1) {
            log.debug("DB저장 실패");
        }

        log.debug("BOARD 객체: {}", board + "저장 성공!");

        return "redirect:/board/list";
    }

    @GetMapping("read")
    public String read(@RequestParam(value = "boardnum",defaultValue = "0") int boardnum
                                                        , Model model) {
        log.debug("가져온 글번호: " + boardnum);

        Board board = service.selectBoard(boardnum);
        log.debug("가져온 게시글 정보: {}", board);

        model.addAttribute("board", board);

        return "/boardView/boardRead";
    }
}
