package net.softsociety.web.service;

import net.softsociety.web.dao.CommentDAO;
import net.softsociety.web.domain.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * projectName     :web
 * fileName        :CommnetServiceImpl
 * author          :yuuna
 * since           :2022/08/18
 */

@Service
public class CommnetServiceImpl implements CommnetService {

    @Autowired
    private CommentDAO dao;

    @Override
    public int insertCmnt(Comment comment) {
        return dao.insertCmnt(comment);
    }

    @Override
    public List<Comment> selectAllCmnt() {
        return dao.selectAllCmnt();
    }
}
