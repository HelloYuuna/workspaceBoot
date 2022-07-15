package net.scit.spring3.controller;

import lombok.extern.slf4j.Slf4j;
import net.scit.spring3.service.PersonService;
import net.scit.spring3.vo.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;

/**
 * DB연결 : CRUD
 * projectName     :spring3
 * fileName        :PersonController
 * author          :yuuna
 * since           :2022/07/13
 */

@Slf4j
@Controller
public class PersonController {
    /*
     * 객체 생성
     * 클래스의 다형성을 이용
     * 실제로는 PersonService를 implement PersonServiceImpl이 사용 됨
     * 따라서 PersonService를 상속받기만하면 하위 클래스가 여러개여도 상관 없음
     * (imple한 하위 클래스는 DAO를 Autowired 할 것!)
     */
    @Autowired
//    PersonDAO dao;
    PersonService service;

    @GetMapping("/insert")
    public String insert() {

        return "/insert";
    }

    /**
     * insert
     * @param person VO
     * @return redirect:/
     */
    @PostMapping("/insert")
    public String insertForm(Person person) {
        log.info("전달된 값: " + person);

        // personDAO를 거쳐서 DB에 저장
//        dao.insertPerson(person);
        service.insertPerson(person);

        return "redirect:/";
    }

    @GetMapping("/select")
    public String select(Model model) {
        ArrayList<Person> personList = service.selectAllPerson();

        if(personList.isEmpty()) {
            log.debug("데이터가 없습니다.");
            return "redirect:/";
        }
        log.info("조회결과: " + personList);
        model.addAttribute("personList", personList);

        return "/select";
    }

    /**
     * delete
     * @param name PersonDB column
     * @return redirect:/
     */
    @GetMapping("/delete")
    public String delete(String name) {
        log.debug("이름:" + name);
        int result = service.deletePerson(name);

        if(result != 1) {
            log.debug("삭제 실패");
            return "redirect:/select";
        }

        log.info("삭제 완료 " + "(" + result + " 건)");      // 커밋자동
        return "redirect:/select";
    }

    @GetMapping("/update")
    public String update(String name, Model model) {
        log.info("이름" + name);
        /*
         * 전달 받은 이름으로 DB에 검색하여 결과를 Person객체로 받아옴
         * 객체를 Model에 저장하여 HTML에 이동
         */
        Person person = service.selectPerson(name);
        model.addAttribute("selectPerson", person);
        log.info("수정전: " + person);

        return "/updateForm";
    }

    @PostMapping("/update")
    public String update(Person person) {
        log.debug("수정후: " + person);
        /*
         * person 정보로 수정
         */
        person.setAge(person.getAge());

        int result = service.updatePerson(person);
        if(result != 1) {
            log.debug("그런 사람 없습니다.");
        }

        log.info("수정 완료");
        return "redirect:/select";
    }
}
