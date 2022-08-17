package net.softsociety.web.controller;

import lombok.extern.slf4j.Slf4j;
import net.softsociety.web.domain.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * projectName     :web
 * fileName        :JQController
 * author          :yuuna
 * since           :2022/08/11
 */

@Controller
@Slf4j
@RequestMapping("/ajax")
public class AjaxController {

    @GetMapping("/aj1")
    public String ajax1() {
        return "/ajView/aj1";
    }

    /*
     * ResponseBody
     * 자바 객체를 Http측에서 요청 (클라이언트) 시
     * 자바 객체를 매핑하여 전달
     */
    @ResponseBody
    @GetMapping("test1")                // Ajax 의 url 과 일치시킬것
    public void test1() {
        log.debug("Controller aj1실행");
    }

    /* dataType: text */
    @ResponseBody
    @PostMapping("test2")
    public void test2(String str) {
        log.debug("받아온값: {}", str);
    }

    @ResponseBody
    @GetMapping("/test3")
    public String test3() {
        return "서버에서 보내는 문자열";
    }

    // 클라에서 받은 문자열을 대문자로 변환해서 클라로 반환
    @ResponseBody
    @GetMapping("/test4")
    public String test4(String str) {
        log.debug("클라에서 받은 str: {}",str);

        return str.toUpperCase();
    }


    /**
     * aj2
     * @return aj2.html
     */
    @GetMapping("/aj2")
    public String ajax2(Model model) {
        model.addAttribute("person", new Person());
        return "/ajView/aj2";
    }

    @ResponseBody
    @PostMapping("insert1")
    public void insert1(String name, int age, String phone) {

        log.debug("이름: {}, 나이: {}, 전화번호: {}", name, age, phone);

    }

    @ResponseBody
    @PostMapping("/insert2")
    public void insert2(Person person) {
        log.debug("person: {}", person);
    }

    @ResponseBody
    @PostMapping("/insert3")
    public void insert3(Person person) {
        log.debug("넘어온객체: {}", person);
    }

    @ResponseBody
    @GetMapping("/getObject")
    public Person getObj() {

        return new Person("차슈",13,"111");
    }

    @ResponseBody
    @GetMapping("/getList")
    public List<Person> getList() {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("차슈", 13, "111"));
        persons.add(new Person("콩이", 10, "222"));
        persons.add(new Person("모야시", 11, "333"));

        return persons;
    }

    /* aj3 */
    @GetMapping("/aj3")
    public String aj3(){
        return "/ajView/aj3";
    }

    @ResponseBody
    @GetMapping("/vote")
    public int increaseToVote(int boardnum) {
        log.debug("보드번호: {}", boardnum);
        // 전달받은 글 번호의 추천수 1증가
        // 현재 추천수 읽어와서 리턴
        int num = 0;
        return num;
    }

}
