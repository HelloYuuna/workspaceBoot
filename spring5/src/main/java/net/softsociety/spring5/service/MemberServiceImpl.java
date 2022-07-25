package net.softsociety.spring5.service;

import lombok.extern.slf4j.Slf4j;
import net.softsociety.spring5.dao.MemberDAO;
import net.softsociety.spring5.domain.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

/**
 * projectName     :spring5
 * fileName        :MemberServiceImpl
 * author          :yuuna
 * since           :2022/07/21
 */

@Service
public class MemberServiceImpl implements MemberService {

    /*
     * DAO 와 비밀번호 암호화 주입
     */
    @Autowired
    private MemberDAO dao;

    @Autowired
    private PasswordEncoder passwordEncoder;

    /**
     * 딘빙행 비밀번호 암호화 필수
     * WebSecurityConfig 의 passwordEncoder 구현
     * @param member 멤버 정보가 담긴 객체
     * @return 1 or 0
     */

    @Override
    public int insertUser(Member member) {
        /*
         * 비밀번호 암호화
         * Member 객체의 encodedPW 를 가져와서
         * 기존의 memberpw 에 암호화하여 넣음
         */
        System.out.println("객체 넘어오나 확인: " + member);
        System.out.println("비밀번호 암호화 전: " + member.getMemberpw());

        // TODO 여기서부터 안넘어감
        String encodedPW = passwordEncoder.encode(member.getMemberpw());
        member.setMemberpw(encodedPW);

        System.out.println("비밀번호 암호화 후: " + encodedPW);

        return dao.insertUser(member);
    }

    /**
     * 아이디 존재 여부 체크
     * 해당 아이디를 가지는 member 객체가 null값이라면
     * return true
     * @param serchId idChk 페이지에서 받은 아이디
     * @return 불리언
     */
    @Override
    public boolean idChk(String serchId) {
        Member member = dao.selectOne(serchId);
//        return member == null? true : false;
        return member == null;
    }
}
