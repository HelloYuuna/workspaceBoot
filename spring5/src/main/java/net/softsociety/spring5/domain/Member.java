package net.softsociety.spring5.domain;

import lombok.Data;

/**
 * projectName     :spring5
 * fileName        :Member
 * author          :yuuna
 * since           :2022/07/21
 */

@Data
public class Member {
    private String memberid;
    private String memberpw;
    private String membername;
    private String email;
    private String phone;
    private String address;
    private int enabled;                // 1 or 0
    private String rolename;            // ROLE_USER or ROLE_ADMIN
}
