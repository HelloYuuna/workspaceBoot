package net.softsociety.web.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * projectName     :web
 * fileName        :Member
 * author          :yuuna
 * since           :2022/08/21
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Member {

    private String memberid;
    private String membername;
}
