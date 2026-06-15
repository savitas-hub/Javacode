package module;

public class LoginSystem {
	
	public static void login(String email) {
		if(email.endsWith("gmail.com")) {
			System.out.println("correct email");
		}else {
			System.out.println("wrong email");
		}
	}	
	public static void login(String email,String password) {
		if(email.endsWith("gmail.com") && password.length()>6) {
			System.out.println("valid");
		}else {
			System.out.println(" invalid");
		}
	}	
	
	public static void login(String email,String password ,String Otp ) {
		if((email.endsWith("gmail.com") && password.length()>6) && Otp.length()>4) {
			System.out.println("valid");
		}else {
			System.out.println(" invalid");
		}
	}	
		
	
	
	public static void main(String[] args) {
		login("Savita@gmail.com");
		login("Savita@gmail.com","savitaa");
		login("Savita@gmail.com","savitaa","ddddd");
		
	}

}