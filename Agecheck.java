package module;

public class Agecheck {
	public static void main(String[] args) {
		int age=68;
		if(age>=18 && age<=60) {
			System.out.println("Eligible to vote");
		}else if(age>60) {
			System.out.println("Senior Citizen");
		}else {
			System.out.println("Not Eligible to vote");
		}
	}

}
