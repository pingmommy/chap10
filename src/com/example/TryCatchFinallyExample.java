package com.example;

public class TryCatchFinallyExample {
	
	
	
	public static void main(String[] args) {
		 xxx();
	
	}
	
		static void xxx() {
			try {
				System.out.println("try");
				return;                     // -> return이 있어도 finally는 실행된다. 무슨 일이 있어도 실행. 
			} catch (Exception e) {

			}finally {
				System.out.println("finally");
			}
			
		}
	
	
	
	
	

	public static void main2(String[] args) {

		
		try {
			System.out.println(10/0);

			
		}catch (ArithmeticException e) {   
			System.out.println(e.getMessage());
		
		}finally {
			System.out.println("항상실행");
		}
		
		System.out.println("END");
	}

}


/* System.out.println(10/0)는 ArithmeticException인데, catch구문의 매개변수 부분에 정확한 Exceptoin 클래스명 변수를 주지 않고
 * Exception형 변수를 써도 괜찮다. Exception이 모든 예외처리 클래스의 부모클래스이기 때문에. */


