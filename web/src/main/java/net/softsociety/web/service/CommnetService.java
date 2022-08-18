package net.softsociety.web.service;

import net.softsociety.web.domain.Comment;

import java.util.List;

/**
 * projectName     :web
 * fileName        :CommnetService
 * author          :yuuna
 * since           :2022/08/18
 */
public interface CommnetService {
    // 댓글 추가
    int insertCmnt(Comment comment);

    // 모든 댓글 목록 가져오기
    List<Comment> selectAllCmnt();

}
