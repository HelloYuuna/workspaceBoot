package net.softsociety.web.controller;

import lombok.extern.slf4j.Slf4j;
import net.softsociety.web.domain.Comment;
import net.softsociety.web.service.CommnetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * projectName     :web
 * fileName        :CommentController
 * author          :yuuna
 * since           :2022/08/18
 */

@Controller
@Slf4j
@RequestMapping("/ajax")
public class CommentController {

//    @Autowired
//    private CommnetService service;

    @GetMapping("/comment")
    public String comment(Model model) {
//
//        List<Comment> comments = service.selectAllCmnt();
//
//        if ( comments.isEmpty() ) {
//            log.debug("목록이 없음");
//
//        } else {
//            log.debug("가져온 목록 객체: {}", comments);
//            model.addAttribute("comments", comments);
//        }

        return "/ajView/comment";
    }

}
