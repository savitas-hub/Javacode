package module;

public class MethodOver {
	
	
	MethodOver(){
		System.out.println("Good Morning");
	}
	MethodOver(int a){
		
		System.out.println("Today is 26");
	}
	public MethodOver(int a, int b) {
		System.out.println("Tuesday");
	}
	public static void add() {
		System.out.println("Addition");
	}
	public static void sub() {
		System.out.println("substraction");
	}
	public static void sub(int a, int b) {
		System.out.println("substraction");
	}

	
	
	public static void main(String[] args) {
		MethodOver mo=new MethodOver();
		new MethodOver(26);
		new MethodOver(26,25);
		add();
		sub();
		sub(20,30);
	
	}

}
