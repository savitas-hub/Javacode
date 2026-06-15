package module;

public class AgeProgram {
	public static void main(String[] args) {
		int age = 98;
		if (age >= 18) {
			if(age>=60) {
				System.out.println("senior");
			}
			else if (age>=40) {
				System.out.println("middle");
			}else {
				System.out.println("Adult");
			}
		}else 
			if(age>=13) {
				System.out.println("tenager");
			}else
			{
				System.out.println("child");
			}
		
}
}