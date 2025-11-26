package org.jdbctemplate;


import java.sql.SQLException;
import java.util.*;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

public class Student {
	@Autowired
	DataSource dataSource;
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public List<Map<String,Object>> getStudentData() throws SQLException{
		return jdbcTemplate.queryForList("SELECT * FROM students");
		
	}
	

}
