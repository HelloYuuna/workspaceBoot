package net.softsociety.practice2.vo;

import lombok.Data;

/**
 * projectName     :practice2
 * fileName        :Item
 * author          :yuuna
 * since           :2022/07/19
 */

@Data
public class ItemList {
    private String pNum;
    private String pName;
    private int pAmount;
    private int pPrice;
}
