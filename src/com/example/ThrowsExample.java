package com.example;

import java.sql.DriverManager;
import java.sql.SQLException;

public class ThrowsExample {
	
	/*
	 * throw : 내(개발자)가 Exception을 던진다. (예외를 일으킨다.)
	 * throws : 문제가 되는 코드가 Exceptoin을 caller한테 던진다.(예외를 떠넘긴다.)  
	 */
	
	

	public static void main(String[] args) throws SQLException {

		try {
			cursorMove(0, 0);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		connect();
	}

	static void cursorMove(int line, int column) throws Exception {
		if(line <=0 || column <=0) {
			throw new Exception("line, column은 1 이상의 값이어야 합니다. ");  
		}
		System.out.println("처리됨");
	}
	
	static void connect() throws SQLException {
		DriverManager.getConnection(null);
	}
}
