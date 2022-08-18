package net.softsociety.web.controller;

import lombok.extern.slf4j.Slf4j;
import net.softsociety.web.domain.Comment;
import net.softsociety.web.service.CommnetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Ajax의 요청 처리 컨트롤러
 * projectName     :web
 * fileName        :CommnetRestController
 * author          :yuuna
 * since           :2022/08/18
 */

@Controller
@Slf4j
@RequestMapping("ajax")
@ResponseBody
public class CommnetRestController {

    @Autowired
    private CommnetService service;

    @PostMapping("/insert")
    public void comntToInsert(Comment comment) {
        log.debug("cmnt: {}", comment);

        int res = service.insertCmnt(comment);
        if ( res < 1 ) { log.debug("행추가 실패"); }

    }

    @GetMapping("select")
    public List<Comment> getCmntList() {
        List<Comment> comments = service.selectAllCmnt();
//        log.debug("가져온 댓글 목록: {}", comments);

        if ( comments.isEmpty() ) {
            log.debug("데이터가 없음");
            comments.add(new Comment(0, "없음", "없음"));
        }

        return comments;
    }
}
