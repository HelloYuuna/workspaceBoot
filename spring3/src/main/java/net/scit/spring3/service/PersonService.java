package net.scit.spring3.service;

import net.scit.spring3.vo.Person;

import java.util.ArrayList;

//서비스 인터페이스
public interface PersonService {
	//저장
	public int insertPerson(Person person);

	public int deletePerson(String name);

	public ArrayList<Person> selectAllPerson();
}
