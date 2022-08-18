package net.softsociety.web.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * projectName     :web
 * fileName        :Board
 * author          :yuuna
 * since           :2022/08/17
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Comment {
    private int num;
    private String name;
    private String text;            // 댓글 내용
}
