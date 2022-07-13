package net.scit.spring3.dao;

import net.scit.spring3.vo.Person;
import org.apache.ibatis.annotations.Mapper;    //Mybatis에서 제공하는 기능

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
}
