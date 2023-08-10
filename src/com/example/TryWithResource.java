package com.example;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TryWithResource {

	public static void main(String[] args)  {

		
	String url="jdbc:oracle:thin:@localhost:1521:xe";
	String user="scott";
	String password="tigerx";
	
	
	//try ()안에 닫아야 하는 리소스를 적는다. 
	try(Connection conn=DriverManager.getConnection(url, user, password);) {
		
		Statement stmt = conn.createStatement();
	     stmt.executeQuery("select * from dept");
	
	     Thread.sleep(1000); 
	
	}catch(SQLException e){
		e.printStackTrace(); 
	}catch (Exception e){  
		e.printStackTrace();
	}

	System.out.println("ENd");
	
	}
}

