package net.softsociety.spring4.dao;

import net.softsociety.spring4.vo.Guest;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;

/**
 * projectName     :spring4
 * fileName        :GuestDAO
 * author          :yuuna
 * since           :2022/07/18
 */
@Mapper
public interface GuestDAO {
    //insert
    int insertGuest(Guest guest);

    //select *
    ArrayList<Guest> selectAll(Guest guest);

    //delete
    int deleteGuest(Guest guest);
}
