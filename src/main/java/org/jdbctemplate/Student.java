package org.jdbctemplate;


import java.sql.SQLException;
import java.util.*;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

public class Student {
	@Autowired
	DataSource dataSource;
	@Autowired
	JdbcTemplate jdbcTemplate;
	private int update;
	private List<Map<String, Object>> queryForList;
	
	public List<Map<String,Object>> getStudentData(){
		return jdbcTemplate.queryForList("SELECT * FROM students");
		
	}
	 void getStudentEmail() {
		// TODO Auto-generated method stub
		
		queryForList = jdbcTemplate.queryForList("SELECT email FROM students WHERE email IS NOT NULL");
		System.out.println(queryForList);

	}
	 String insertStudentData(int sId,String sName,int sAge) {
		Object arr[]= {sId,sName,sAge};
		String sql="INSERT INTO students (student_id,name,age) VALUES (?,?,?)";
		update = jdbcTemplate.update(sql,arr);
		 if(update==1)
		 {
			 return "Student Inserted Successfully";
		 }
		 else {
			return "Student not inserted";
		}
		

	}
	 String deleteStudent(int sId) {
		 Object arr[]= {sId};
		 int delete = jdbcTemplate.update("DELETE FROM students WHERE student_id=?",arr);
		 if(delete==1)
		 {
			 return "Student deleted";
		 }
		 else {
			 return "Student not deleted";
		 }
		 
	 }
	 String updateStudentEmail(String sEmail,int sId) {
		 Object arr[]= {sEmail,sId};
		 int emailUpdate = jdbcTemplate.update("UPDATE students SET email=? WHERE student_id=?",arr);
		 if(emailUpdate==1)
		 {
			 return "Email Updated";
		 }
		 else {
			return "Email not Updated";
		}
	 
	 }
	 String getStudentByDept(int sId)
	 {
		 if(sId<=11 && sId>0){
			 String sql="SELECT department from students WHERE student_id = ?";
			 String studentDeptString = jdbcTemplate.queryForObject(sql, String.class,sId);
			 
//			 System.out.println(studentDeptString);
			 if(studentDeptString!=null)
			 {
				 return studentDeptString; 
			 }
			 else {
				 return "Not Found";
			 }
		 }
		 else {
			return "Student Not Found";
		}
		
		 
		 
	 }
	  
	

}
