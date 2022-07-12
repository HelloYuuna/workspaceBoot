package net.scit.practice1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * projectName     :practice1
 * fileName        :PracController
 * author          :yuuna
 * since           :2022/07/06
 */

@Controller
public class CalcController {

    @GetMapping("/prac/calc")
    public String calc() {
        return "calc/calc";
    }

    @PostMapping("/prac/calcResult")
    public String calcResult(Model model, float rightNum, float leftNum, String oper) {
        float result = 0;
        model.addAttribute("rightNum", rightNum);
        model.addAttribute("leftNum", leftNum);
        model.addAttribute("oper", oper);
//        System.out.println(oper);
//        System.out.println(rightNum);
//        System.out.println(leftNum);
        try {

        switch (oper) {
            case "+":
                result = (int) (rightNum + leftNum);
                model.addAttribute("result", result);
                break;
            case "-":
                result = (int) leftNum - rightNum;
                model.addAttribute("result", result);
                break;
            case "/":
                if(rightNum == 0.0) {
//                    System.out.println("0으로 나눌 수 없습니다.");
                    return "redirect:/prac/calc";
                }

                result = leftNum / rightNum;
                model.addAttribute("result", result);
                break;
            case "*":
                result = rightNum * leftNum;
                model.addAttribute("result", result);
                break;
            default: throw new Exception("연산자 오류");
            }

        } catch (Exception e) {
            e.printStackTrace();
            return "redirect:/prac/calc";
        }

        return "calc/calcResult";
    }
}
