package com.example;

public class AutoCloseExample {
	
	static class Alpha implements AutoCloseable{
		void show()throws Exception {
			System.out.println("show...");
			throw new Exception();
		}

		@Override
		public void close() throws Exception {
			System.out.println("close...");
		}
		
	}
	

	public static void main(String[] args) {

		
		   try(Alpha a = new Alpha()) {  
				a.show();
			}catch(Exception e){
				System.out.println("exception 발생");
			}
		System.out.println("프로그램종료");	

	}
		

}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	static class Alpha{
//		void show()throws Exception {
//			System.out.println("show...");
//			
//		}
//


//		
//		void close() throws Exception {
//			System.out.println("close...");
//			throw new Exception();
//		}
//	}
//	
//
//	public static void main(String[] args) {
//
//		Alpha a = new Alpha();
//		   try {
//				a.show();
//			}catch(Exception e){
//				e.printStackTrace();
//			}finally {
//			try {
//				a.close();
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//
//	}
//		
//
//}

