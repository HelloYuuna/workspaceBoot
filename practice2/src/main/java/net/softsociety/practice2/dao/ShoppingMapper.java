package net.softsociety.practice2.dao;

import net.softsociety.practice2.vo.ItemList;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * projectName     :practice2
 * fileName        :ShoppingMapper
 * author          :yuuna
 * since           :2022/07/19
 */
@Mapper
public interface ShoppingMapper {
    // selectItems
    List<ItemList> selectItems();

    ItemList selectItem(String pnum);
}
