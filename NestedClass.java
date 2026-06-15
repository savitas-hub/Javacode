package module;

public class NestedClass {
	public static void main(String[] args) {

		String username = "lavita";
		int password = 12345;

		if (username == "lavita") {
			System.out.println("Username is correct");
			if (password == 12345) {
				System.out.println("Login Successful");
			} else {
				System.out.println(" Incorrect Password");
			}

		} else {
			System.out.println("Username is incorrect");
		}
	}

}
