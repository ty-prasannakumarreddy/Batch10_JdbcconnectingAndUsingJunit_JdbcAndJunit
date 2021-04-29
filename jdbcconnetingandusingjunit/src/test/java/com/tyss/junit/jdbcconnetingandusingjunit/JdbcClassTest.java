package com.tyss.junit.jdbcconnetingandusingjunit;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.junit.jupiter.api.Test;

class JdbcClassTest {
	

	@Test
	public void insertTest() {
		Connection connection= null;
		Statement statement = null;
		 try {
			 JdbcClass insertRef = new JdbcClass();
			 insertRef.insert(1, "prasannakumarReddy");
			 //lodding the drivers.....
			 Class.forName("com.mysql.cj.jdbc.Driver");
			 //getting  the connection form the database
			connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb","root","root");
			// query for the inserting into database
			String query = "select * from student";
			statement=connection.createStatement();
		 ResultSet rSet =	statement.executeQuery(query);
		// rSet.next();
		 
		// assertEquals(1, rSet.getInt(1));
	//	 assertEquals("prasannakumarReddy",rSet.getString(2));
			
			
			 
		 }catch(Exception e) {
			 e.printStackTrace();
		 }
		
	}

}
