package module;

public class CheckingNum {
	public static void main(String[] args) {
		int a=14;
		if(a>=1 && a<=10) {
			System.out.println("Number is Between 1 to 10");
		}else if(a>=11 && a<=20) {
		System.out.println("Number is Between 11 to 20");
		
		}else if(a>20) {
			System.out.println("Number is Above 20");
		}else {
			System.out.println("Number is lesser");
		}
	}

}
