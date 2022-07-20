package net.softsociety.practice2.service;

import net.softsociety.practice2.dao.ShoppingMapper;
import net.softsociety.practice2.vo.ItemList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * projectName     :practice2
 * fileName        :ShoppingImpl
 * author          :yuuna
 * since           :2022/07/19
 */

@Service
public class ShoppingServiceImpl implements ShoppingService {

    @Autowired
    private ShoppingMapper dao;

    @Override
    public List<ItemList> selectItems() {
        return dao.selectItems();
    }

    @Override
    public ItemList selectItem(String pnum) {
        return dao.selectItem(pnum);
    }
}
