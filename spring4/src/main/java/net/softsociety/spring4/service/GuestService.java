package net.softsociety.spring4.service;

import net.softsociety.spring4.vo.Guest;

import java.util.ArrayList;

/**
 * projectName     :spring4
 * fileName        :GuestService
 * author          :yuuna
 * since           :2022/07/18
 */
public interface GuestService {
    //게시판추가
    int insertGuest(Guest guest);

    //전체검색
    ArrayList<Guest> selectAll(Guest guest);

    //한명삭제
    int deleteGuest(Guest guest);
}
