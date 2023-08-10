package com.example;

/*Exception : 실행 시 나는 오류  =>2종류가 있다. 
  
  아래 기술되는 Exception은 클래스로써 'Exception'이다. (Exception도 객체다.) 
  
- compiler checked(Exception:일반예외) : 컴파일러가 예외 처리 코드 여부를 검사하는 예외
   => 컴파일러가 코드를 봤을 때 컴파일 시 예외가 발생할 가능성이 높은 코드일 때 개발자에게 예외처리 코드를 넣도록 강제하는 Exception
   => 예외처리하지 않으면 컴파일이 되지 않는다. 5~10%에 해당. 
   => 코드 작성단계에서 에러여부를 알 수 있고 에러처리 또한 가능하다.( ex : Thread.sleep)
   => 자바에만 있음. 
   
    
- compiler unchecked(runtimeException: 실행예외) : 컴파일러가 예외 처리 코드 여부를 검사하지 않는 예외 
   => 실행 시 에러가 날 수 있으나  컴파일러가 신경쓰지 않는다. 
   => 코드 작성 시에는 에러여부를 알 수 없다. (컴파일단계에서는 에러나지 않음.)
   => 실행에러가 바로 발생함. 90%에 달한다. 
   

*Exception클래스를 상속받은 엄청나게 많은 자식 Exception클래스가 있다. 
*
*그 중에서 runtimeexception 클래스를 상속받으면 
*컴파일러가 컴파일 시 체크하지 않아서 실행 후에야 에러여부를 확인할 수 있다. 
*(runtimeexception도 exception의 자식 클래스)
*
*
*
*
*
*/

public class ExceptionExample {

	// compiler unchecked(runtimeException)
	// 컴파일 시 에러가 나지 않는다. 그러나 실행 시 에러난다. 
	
	public static void main(String[] args) {
		String str = null;
		
		System.out.println(str.toUpperCase());
		
		RuntimeException x;
		
		Exception d;
	}
	
	
	
	public static void main2(String[] args)  {	
		int num =100;
		int result = num /0; //0으로 나눠지지 않으므로 에러코드인데, 컴파일 시 문제가 발생하지 않는다. -> 실행 시 오류
		
		System.out.println(result); 
	
		
	}

}
