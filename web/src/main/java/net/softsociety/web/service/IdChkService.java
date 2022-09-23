package net.softsociety.web.service;

import net.softsociety.web.domain.Member;

/**
 * projectName     :web
 * fileName        :IdChkService
 * author          :yuuna
 * since           :2022/08/21
 */
public interface IdChkService {

    // idChk
    boolean idChk(String id);

    // 회원가입
    int insertMember(Member member);
}
