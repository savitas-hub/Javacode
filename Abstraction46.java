package module;

abstract class ParentAb1 {
	abstract void method1();

	static void method2() {
		System.out.println("Concrete Method");
	}
}

public class Abstraction46 extends ParentAb1 {

	public static void main(String[] args) {
		method2();
		Abstraction46 ab = new Abstraction46();
		ab.method1();
	}

	@Override
	void method1() {
		System.out.println("50% Abstraction");

	}

}
