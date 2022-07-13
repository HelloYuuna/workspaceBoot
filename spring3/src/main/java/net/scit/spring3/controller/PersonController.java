package net.scit.spring3.controller;

import lombok.extern.slf4j.Slf4j;
import net.scit.spring3.service.PersonService;
import net.scit.spring3.vo.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * projectName     :spring3
 * fileName        :PersonController
 * author          :yuuna
 * since           :2022/07/13
 */

@Slf4j
@Controller
public class PersonController {
    /* 객체 생성 */
    @Autowired
//    PersonDAO dao;
    /*
     * 클래스의 다형성을 이용
     * 실제로는 PersonService를 구현한 PersonServiceImpl이 사용 됨
     * PersonService를 상속받기만하면 상속받은 하위 클래스가 여러개여도 상관없음
     */
    PersonService service;

    @GetMapping("/insert")
    public String insert() {

        return "/insert";
    }

    @PostMapping("/insertForm")
    public String insertForm(Person person, Model model) {
        log.info("전달된 값: " + person);

        // personDAO를 거쳐서 DB에 저장
//        dao.insertPerson(person);
        service.insertPerson(person);
        model.addAttribute("person", person);

        return "/insertForm";
    }

}
