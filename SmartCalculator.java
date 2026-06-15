package module;

public class SmartCalculator {
	
	
	static void add(int a, int b) {
		int sum=a+b;
		System.out.println (sum);
	}

	static void add(int a, int b,int c) {
		int sum=a+b+c;
		System.out.println(sum);
	}
	static void add(int a, double b) {
		double sum=a-b;
		System.out.println(sum);
	}
	static void add(double a, double b) {
		double sum=a*b;
		System.out.println(sum);
	}
	public static void main(String[] args) {
		add(10,20);
		add(10,20,30);
		add(10.35,34.67);
		add(23.067,24.067);
	}
}
