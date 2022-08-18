package net.softsociety.web.dao;

import net.softsociety.web.domain.Comment;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * projectName     :web
 * fileName        :CommentDAO
 * author          :yuuna
 * since           :2022/08/18
 */

@Mapper
public interface CommentDAO {
    // 댓글 저장
    int insertCmnt(Comment comment);

    // 모든 댓글 목록
    List<Comment> selectAllCmnt();
}
