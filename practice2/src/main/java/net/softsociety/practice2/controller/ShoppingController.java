package net.softsociety.practice2.controller;

import lombok.extern.slf4j.Slf4j;
import net.softsociety.practice2.service.ShoppingService;
import net.softsociety.practice2.vo.ItemList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * projectName     :practice2
 * fileName        :ShoppingController
 * author          :yuuna
 * since           :2022/07/19
 */

@Slf4j
@Controller
public class ShoppingController {

    @Autowired
    private ShoppingService service;

    @GetMapping("/shopping")
    public String gotoShopping(Model model) {
        List<ItemList> items = service.selectItems();
        log.info("Item List: " + items);
        model.addAttribute("items", items);

        return "shopping";
    }

    @GetMapping("/detail")
    public String gotoDetail(String pnum, Model model) {
        log.info("아이템 번호: " + pnum);                                    // 상품번호
        ItemList selectItem = service.selectItem(pnum);

        if (selectItem == null) {
            log.info("해당하는 아이템 없음");
            return "redirect:/";
        }

        log.info("가져온 아이템" + selectItem);
        model.addAttribute("selectItem", selectItem);

        return "/detail";
    }
}
