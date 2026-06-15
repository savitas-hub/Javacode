package module;

public class SwitchMarks {
	public static void main(String[] args) {
		int marks=21;
		
		switch(marks/10) {
	case 3:
		if (marks>=35 && marks<=50) {
		System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		break;
	
	case 4:
		if (marks>=40) {
		System.out.println("pass");
		}
		break;
	
	case 5:
		if (marks>=50) {
		System.out.println("Second Class");
		}
		break;
	case 6:
		if(marks>=60) {
		System.out.println("First Class");
		}
		break;
	case 7:
		if(marks>=75 && marks<=100) {
		System.out.println("Distriction");
		}
		break;
	
	default:
	
		System.out.println("fail");

}


	}}

