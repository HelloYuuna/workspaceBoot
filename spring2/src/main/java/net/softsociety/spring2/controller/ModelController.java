package net.softsociety.spring2.controller;

import net.softsociety.spring2.controller.vo.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 서버에서 클라이언트에게 받은 값을 보여주기
 * http는 서버를 한번 끊으면 값이 유지되지 않음 > 자바에서 핸들링 (session cookie DB 사용)
 * projectName     :spring2
 * fileName        :ModelController
 * author          :yuuna
 * since           :2022/07/05
 */

@Controller
public class ModelController {

    /*
     * Model객체 사용
     * addAttribute(String name, Object value)
     * addAttribute(Object attributeValue)
     */
    @GetMapping("/model/model1")
    public String model(Model model) {
        String str = "서버의 문자열";
        model.addAttribute("string", str);

        int num = 100;
        model.addAttribute("number", num);

        Person person = new Person("김", "KT", "1111");
//        model.addAttribute("person", person); 객체타입은 변수명만 적으면 됨
        model.addAttribute(person);

        return "model1";            //fowarding
    } //메소드가 끝날때 local variable 은 사라짐
}
