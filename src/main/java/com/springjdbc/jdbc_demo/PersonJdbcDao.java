package com.springjdbc.jdbc_demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PersonJdbcDao
{
    @Autowired
    JdbcTemplate jdbcTemplate;
    // select * from person
    public List<Person> findall(){
     return jdbcTemplate.query("select * from person",new BeanPropertyRowMapper(Person.class));
    }
}
