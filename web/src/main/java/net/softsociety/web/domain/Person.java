package net.softsociety.web.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * projectName     :web
 * fileName        :Person
 * author          :yuuna
 * since           :2022/08/17
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {
    private String name;
    private int age;
    private String phone;
}
