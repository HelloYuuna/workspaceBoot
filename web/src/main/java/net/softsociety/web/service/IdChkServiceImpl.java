package net.softsociety.web.service;

import net.softsociety.web.dao.IdChkDAO;
import net.softsociety.web.domain.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * projectName     :web
 * fileName        :IdChkServiceImpl
 * author          :yuuna
 * since           :2022/08/21
 */

@Service
public class IdChkServiceImpl implements IdChkService{

    @Autowired
    private IdChkDAO dao;

    @Override
    public boolean idChk(String id) {
        Member member = dao.idChk(id);

        return member == null;
    }

    @Override
    public int insertMember(Member member) {
        return dao.insertMember(member);
    }
}
