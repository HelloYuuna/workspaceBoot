package net.softsociety.spring5.service;

import net.softsociety.spring5.domain.Member;

/**
 * projectName     :spring5
 * fileName        :MemberService
 * author          :yuuna
 * since           :2022/07/21
 */

public interface MemberService {

    int insertUser(Member member);

    boolean idChk(String serchId);
}
