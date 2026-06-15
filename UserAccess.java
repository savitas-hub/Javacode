package module;

public class UserAccess {
	public static void main(String[] args) {
		String username="savita";
		int password=1234;
		String role="admin";
		String role1="user";
		String role2="guest";
		if (username == "savita") {
			
			if (password == 1234) {
		    if(role=="ydmin") {
				System.out.println("full access");
			} else if (role1=="ser") {
				System.out.println("Limited Access");

		} else if (role2=="uest") {
			System.out.println("Guest Access");
		}else {
			System.out.println("Wrong Password");
		}
	}else
	{System.out.println("Invalid username");
	}
		}
	}
}