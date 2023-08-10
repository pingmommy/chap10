package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * 예외는 주로 연산자, 메소드 안에서 발생한다.  
 * 예외는 발생하면 특별한 처리를 하지 않는 이상 JVM까지 올라가서 결국 프로그램이 종료된다. 
 * 예외를 처리하는 코드가 있어야 겠지?? => try,catch or Throws
 * 
 * 예외처리를 강요하는 Exception이 있다. checked Exeption
 * 안정성때문에 checked Exception이 있음. 
 * 
 */
public class ExceptionExample2 {
	
	
	public static void main3(String[] args) throws SQLException {
		
		
		String url = null;
		String id = null;
		String pw = null;
		Connection conn = DriverManager.getConnection(url, id, pw); //=>SQLException을 강요함. 
	}
	
	public static void main(String[] args) {
		System.out.println("Start...");
		
		Scanner scan = new Scanner(System.in);
		System.out.print(">>");
		
		//예외처리코드
		try {
		int n = scan.nextInt();
		System.out.println("num = "+ n);
		}catch (InputMismatchException e) {  // 38행에서 발생한 예외를 매개변수 e 안에 넣는다. 처리해야 겠지? catch의 수행문에 처리코드를 넣는다.
			System.out.println("입력값은 수치가 아닙니다.");
			System.out.println(e.getMessage());
		}
		System.out.println("End....");
	}
	
	
	

	public static void main2(String[] args) {
		System.out.println("Start...");
		
		System.out.println(100/0); // 예외발생! 100/0은 수학적으로 정의되지 않음.  
		//예외가 발생하면 따로 처리해주지 않는 이상 프로그램이 이 단계에서 죽어서 다음 코드는 실행이 안 된다. 
		//예외가 발생했는데 계속 실행문이 실행되면 부작용이 더 크다. 
		
		
		System.out.println("End....");
	}

}
