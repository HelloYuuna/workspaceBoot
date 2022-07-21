package net.softsociety.spring5.service;

import net.softsociety.spring5.dao.MemberDAO;
import net.softsociety.spring5.domain.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * projectName     :spring5
 * fileName        :MemberServiceImpl
 * author          :yuuna
 * since           :2022/07/21
 */

@Service
public class MemberServiceImpl implements MemberService {

    @Autowired
    private MemberDAO dao;

    @Override
    public int insertUser(Member member) {
        return dao.insertUser(member);
    }
}
