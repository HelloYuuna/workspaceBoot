package net.softsociety.practice2.controller;

import lombok.extern.slf4j.Slf4j;
import net.softsociety.practice2.service.CartService;
import net.softsociety.practice2.service.ShoppingService;
import net.softsociety.practice2.vo.ItemList;
import net.softsociety.practice2.vo.OrderList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * projectName     :practice2
 * fileName        :CartController
 * author          :yuuna
 * since           :2022/07/19
 */

@Slf4j
@Controller
public class CartController {

    @Autowired
    private CartService cartService;

    @GetMapping("/cart")
    public String gotoCartFromHome() {
        //selectAll orderlist
        return "/cart";
    }

    /**
     * 제품 번호를 받아서 post방식으로 들어옴
     * @return cart 페이지
     */
    @PostMapping("/cart")
    public String gotoCart(OrderList orderList) {
        log.debug("가져온 객체값 orderList" + orderList);

        // DB에 담기
        int res = cartService.insertCart(orderList);

        if (res != 1) {
            log.debug("카트 담기 실패!");
            return "redirect:/";
        }
        //selectAll orderlist
        orderList = cartService.selectOrders();
        log.debug("가져온 장바구니 목록: ",orderList);

        return "/cart";
    }

    /**
     * Cart 장바구니 삭제
     * @return redirect
     */
    @PostMapping("/deleteCart")
    public String deleteCart() {

        return "redirect:/cart";
    }
}
