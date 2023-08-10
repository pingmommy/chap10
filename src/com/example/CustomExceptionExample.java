package com.example;

public class CustomExceptionExample {

	static class DividedByZeroException extends Exception{

		public DividedByZeroException() {
		}
		public DividedByZeroException(String msg) {
			super(msg);
		}
	}	
	public static void main(String[] args) {

		
	 try {
		xxx();
	} catch (DividedByZeroException e) {
		System.out.println(e.getMessage());
	}
		
	}
	
	static void xxx() throws DividedByZeroException {
		throw new DividedByZeroException("사용자예외발생");
	}

}
