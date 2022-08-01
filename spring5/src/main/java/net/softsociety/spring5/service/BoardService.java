package net.softsociety.spring5.service;

import net.softsociety.spring5.domain.Board;

import java.util.List;

/**
 * projectName     :spring5
 * fileName        :BoardService
 * author          :yuuna
 * since           :2022/07/27
 */
public interface BoardService {
    // 작성한 게시글 등록
    int insertBoard(Board board);

    List<Board> selectBoardList(String type, String searchword);

    Board selectBoard(int boardnum);

}
