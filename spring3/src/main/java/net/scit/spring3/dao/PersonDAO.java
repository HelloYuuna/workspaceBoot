package net.scit.spring3.dao;

import net.scit.spring3.vo.Person;
import org.apache.ibatis.annotations.Mapper;    //Mybatis에서 제공하는 기능

import java.util.ArrayList;

/**
 * DB와 자바를 이어줌 Mapping
 * projectName     :spring3
 * fileName        :PersonDAO
 * author          :yuuna
 * since           :2022/07/13
 */

@Mapper
public interface PersonDAO {
    public int insertPerson(Person person);

    public int deletePerson(String name);

    public ArrayList<Person> selectAllPerson();

    public Person selectPerson(String name);

    public int updatePerson(Person person);
}
