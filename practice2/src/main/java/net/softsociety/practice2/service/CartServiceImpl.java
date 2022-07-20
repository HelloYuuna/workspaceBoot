package net.softsociety.practice2.service;

import net.softsociety.practice2.dao.CartMapper;
import net.softsociety.practice2.vo.OrderList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * projectName     :practice2
 * fileName        :CartImpl
 * author          :yuuna
 * since           :2022/07/20
 */
@Service
public class CartServiceImpl implements CartService {

    @Autowired
    private CartMapper dao;

    @Override
    public int insertCart(OrderList orderList) {
        return dao.insertCart(orderList);
    }
}
