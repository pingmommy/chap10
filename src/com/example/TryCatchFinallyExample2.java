package com.example;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TryCatchFinallyExample2 {

	public static void main(String[] args)  {

		
	String url="jdbc:oracle:thin:@localhost:1521:xe";
	String user="scott";
	String password="tigerx";
	
	Connection conn =null;
	
	try {
		conn = DriverManager.getConnection(url, user, password);
		Statement stmt = conn.createStatement();
	     stmt.executeQuery("select * from dept");
	     
	     
	}catch(SQLException e){
		e.printStackTrace(); // 에러난 지점을 알려준다. 
	}
		
	// 리소스를 열었으면 닫아야 하는데(conn.close();), 아래 구문은 실행될지 안 될지 확신할 수 없다. 
	// 실행된다해도
	try {
			conn.close();
	} catch (SQLException e) {
			e.printStackTrace();
	}
	

	System.out.println("ENd");
	
	}
}

/*SQLException => checked Exeption. */