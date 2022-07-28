package net.softsociety.spring5.service;

import net.softsociety.spring5.dao.BoardDAO;
import net.softsociety.spring5.domain.Board;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * projectName     :spring5
 * fileName        :BoardServiceImpl
 * author          :yuuna
 * since           :2022/07/27
 */

@Service
public class BoardServiceImpl implements BoardService {

    @Autowired
    private BoardDAO dao;

    /**
     * 게시글 등록
     * @param board id title textarea
     * @return 등록 결과 0 or 1
     */
    @Override
    public int insertBoard(Board board) {
        return dao.insertBoard(board);
    }

    @Override
    public List<Board> selectBoardList() {
        return dao.selectBoardList();
    }

    @Override
    public Board selectBoard(int boardnum) {

        // 히트카운트 업
        int res = dao.updateBoardCNT(boardnum);

        if ( res < 1 ) {
            System.out.println("처리 실패~");
        }

        return dao.selectBoard(boardnum);
    }
}
