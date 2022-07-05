package net.softsociety.spring2.controller;

import net.softsociety.spring2.controller.vo.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * projectName     :spring2
 * fileName        :ParamController
 * author          :yuuna
 * since           :2022/07/05
 */

@Controller
public class ParamController {

    @GetMapping("/param/param1")
    public String param1() {
        return "param1";
    }

    @GetMapping({"/param/input1"}) //경로 관련해서 질문, 애가 어떻게 입력된 정보들을 가져오는지 질문
    public String input1(String name, String phone, String phonenum) {
        System.out.println("이름: "+name);
        System.out.println("통신사: "+phone);
        System.out.println("전화번호: "+phonenum);
//        return "redirect:/";
        return "home";
    }

    @GetMapping({"/param/param2"})
    public String param2() {
        return "param2";
    }

    @PostMapping({"/param/input2"})
    public String input2(String name, String phone, String phonenum) {
        System.out.println("이름: " + name);
        System.out.println("통신사: " + phone);
        System.out.println("전화번호: " + phonenum);
        return "redirect:/";
    }

    @GetMapping({"/param/param3"})
    public String param3() {
        return "param3";
    }

    @GetMapping({"/param/input3"})
    public String input3(Person person) {
        System.out.println(person);
        return "redirect:/";
    }

//    @GetMapping({"/param/param4"})
//    public String param4() {
//        return "param4";
//    }

    /*
     * @RequestParam
     * name 파라메터 값이 넘어왓을때
     * name이라는 변수에 넣어줌
     * 없다면 defaultValue 값으로 넣는다
     * Null값이 넘어오는것을 막는다
     */
    @GetMapping({"/param/param4"})
    public String input4 (String name, String age) {
        if(age == null) {
            age = "0";
        }

        System.out.println(name + ", " + age);
        return "redirect:/";
    }
//    @GetMapping({"/param/param4"})
//    public String input4 (
//            @RequestParam(name="name", defaultValue = "default") String name,
//            @RequestParam(name="age", defaultValue = "0") int age) {
//        System.out.println(name + ", " + age);
//        return "redirect:/";
//    }

}
