package ex07;

public class LoginExample {

	public static void main(String[] args) {
		
		System.out.println("사용자 1>>");
		try {
			login("white","12345");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		System.out.println("사용자 2>>");
		try {
			login("blue","54321");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		
	}

	private static void login(String id, String password)throws Exception {
		if(!id.equals("blue")) {
			throw new NotExistIDException("ID가 존재하지 않습니다.");
		}
		if(!password.equals("12345")) {
			throw new WrongPasswordException("비밀번호가 일치하지 않습니다.");
		}
	}

}
