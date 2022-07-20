package net.softsociety.practice2.service;

import net.softsociety.practice2.vo.ItemList;

import java.util.List;

/**
 * projectName     :practice2
 * fileName        :Shopping
 * author          :yuuna
 * since           :2022/07/19
 */
public interface ShoppingService {

    List<ItemList> selectItems();

    ItemList selectItem(String pnum);
}
