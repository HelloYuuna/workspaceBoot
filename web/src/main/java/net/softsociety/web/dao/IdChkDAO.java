package net.softsociety.web.dao;

import net.softsociety.web.domain.Member;
import org.apache.ibatis.annotations.Mapper;

/**
 * projectName     :web
 * fileName        :IdChkDAO
 * author          :yuuna
 * since           :2022/08/21
 */

@Mapper
public interface IdChkDAO {

    // id check
    Member idChk(String id);

    // 회원가입
    int insertMember(Member member);
}
