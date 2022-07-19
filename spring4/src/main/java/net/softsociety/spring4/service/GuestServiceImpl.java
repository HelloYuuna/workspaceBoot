package net.softsociety.spring4.service;

import net.softsociety.spring4.dao.GuestDAO;
import net.softsociety.spring4.vo.Guest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * projectName     :spring4
 * fileName        :GuestServiceImpl
 * author          :yuuna
 * since           :2022/07/18
 */

@Service
public class GuestServiceImpl implements GuestService {

    @Autowired
    GuestDAO dao;

    @Override
    public int insertGuest(Guest guest) {
        return dao.insertGuest(guest);
    }

    @Override
    public ArrayList<Guest> selectAll(Guest guest) {
        return dao.selectAll(guest) ;
    }

    @Override
    public int deleteGuest(Guest guest) {
        return dao.deleteGuest(guest);
    }
}
