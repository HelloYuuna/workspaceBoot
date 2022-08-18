package net.softsociety.web.service;

import lombok.extern.slf4j.Slf4j;
import net.softsociety.web.dao.BoardDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * projectName     :web
 * fileName        :BoardServiceImpl
 * author          :yuuna
 * since           :2022/08/17
 */
@Service
@Slf4j
public class BoardServiceImpl implements BoardService {

    @Autowired
    private BoardDAO dao;


    @Override
    public int updateCnt(int boardnum) {
        int res = dao.updateCnt(boardnum);
        log.debug("res: {}", res);

        if(res < 1) {
            log.debug("실패");
        } else {
            log.debug("성공");
        }

        return dao.selectCnt(boardnum);
    }
}
