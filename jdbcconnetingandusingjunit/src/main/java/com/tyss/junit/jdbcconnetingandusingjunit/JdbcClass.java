package com.tyss.junit.jdbcconnetingandusingjunit;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

public class JdbcClass  implements JdbcInterface{

	@Override
	public void insert(int uid, String uname) {
		
		Connection connection= null;
		PreparedStatement preStatement = null;
		 try {
			 //lodding the drivers.....
			 Class.forName("com.mysql.cj.jdbc.Driver");
			 //getting  the connection form the database
			connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb","root","root");
			// query for the inserting into database
			String query = "insert into student  values(?,?)";
			preStatement= connection.prepareStatement(query);
			preStatement.setInt(1,uid);
			preStatement.setString(2, uname);
			preStatement.execute();
			
			
			 
		 }catch(Exception e) {
			 e.printStackTrace();
		 }
		 finally {
			 if (connection!= null)
				try {
					connection.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			 if(preStatement != null)
				try {
					preStatement.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		 }
		
		
	}

	@Override
	public ArrayList<Object> select() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(int uid, String uname) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int uid) {
		// TODO Auto-generated method stub
		
	}

}
