package net.scit.spring3.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
import net.scit.spring3.dao.PersonDAO;
import net.scit.spring3.vo.Person;

import java.util.ArrayList;

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

	@Override
	public int deletePerson(String name) {
		return personDAO.deletePerson(name);
	}

	@Override
	public ArrayList<Person> selectAllPerson() {
		return personDAO.selectAllPerson();
	}

	@Override
	public Person selectPerson(String name) {
		return personDAO.selectPerson(name);
	}

	@Override
	public int updatePerson(Person person) {
		return personDAO.updatePerson(person);
	}
}
