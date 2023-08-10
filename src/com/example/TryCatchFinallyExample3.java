package com.example;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TryCatchFinallyExample3 {

	public static void main(String[] args)  {

		
	String url="jdbc:oracle:thin:@localhost:1521:xe";
	String user="scott";
	String password="tigerx";
	
	Connection conn =null;
	
	try {
		conn = DriverManager.getConnection(url, user, password);
		Statement stmt = conn.createStatement();
	     stmt.executeQuery("select * from dept");
	
	     Thread.sleep(1000); // 또다른 예외발생(a)
	}
   
	// 다중캐치	
	catch(SQLException e){
		e.printStackTrace(); // 에러난 지점을 알려준다. 
	} 
	
	//(a)에 대한 예외처리
	catch (Exception e)
	/*Exception은 모든 예외클래스의 최상위 클래스. 처리해야 할 예외클래스들이 상속관계 있을 경우 하위 클래스 catch블록을 먼저 작성하고
	   상위 클래스 catch블록을 나중에 작성해야 함. */
	{  
		e.printStackTrace();
	}
	
	//finally 구문은 예외발생여부와 상관없이 항상 실행. 주로 자원을 닫는 실행문을 넣는다. 
	finally {
		try {
			if(conn != null)
			    conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		
		}
	}

	System.out.println("ENd");
	
	}
}

/*SQLException => checked Exeption. */