package net.softsociety.practice2.vo;

import lombok.Data;

/**
 * projectName     :practice2
 * fileName        :OrderList
 * author          :yuuna
 * since           :2022/07/19
 */

@Data
public class OrderList {
    private String orderNum;
    private String usrId;
    private String usrName;
    private String usrAddress;
    private String pNum;                       //otemlist reference
    private String pName;
    private int pAmount;
    private int pPrice;
}
