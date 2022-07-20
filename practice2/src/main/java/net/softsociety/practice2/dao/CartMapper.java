package net.softsociety.practice2.dao;

import net.softsociety.practice2.vo.OrderList;
import org.apache.ibatis.annotations.Mapper;

/**
 * projectName     :practice2
 * fileName        :Cart
 * author          :yuuna
 * since           :2022/07/20
 */

@Mapper
public interface CartMapper {

    int insertCart(OrderList orderList);    // 카트에 담기
}
