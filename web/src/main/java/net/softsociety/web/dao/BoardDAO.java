package net.softsociety.web.dao;

import org.apache.ibatis.annotations.Mapper;

/**
 * projectName     :web
 * fileName        :BoardDAO
 * author          :yuuna
 * since           :2022/08/17
 */

@Mapper
public interface BoardDAO {

    int updateCnt(int boardnum);

    int selectCnt(int boardnum);
}
