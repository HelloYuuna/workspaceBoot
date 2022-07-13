package net.scit.spring3.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
import net.scit.spring3.dao.PersonDAO;
import net.scit.spring3.vo.Person;

//PersonService 인터페이스의 구현체
@Service
@Slf4j
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonDAO personDAO;

	//저장
	@Override
	public int insertPerson(Person person) {

//		 int result = personDAO.insertPerson(person);
		return personDAO.insertPerson(person);
	}

}
