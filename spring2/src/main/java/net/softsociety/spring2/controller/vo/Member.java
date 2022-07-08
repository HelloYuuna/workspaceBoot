package net.softsociety.spring2.controller.vo;

import lombok.*;

/**
 * Lombok: 데이터만 수정할 수 있도록 간단하게 만들어주는 것
 * projectName     :spring2
 * fileName        :Member
 * author          :yuuna
 * since           :2022/07/08
 */

//@ToString
//@Getter
//@Setter
@Data
@NoArgsConstructor      //default
@AllArgsConstructor
public class Member {
    String id;
    String password;
    String name;
    String address;

    public void test() {
        System.out.println("Test메소드 실행");
    }
}
