package module;

public class Para {
	static void add() {
		System.out.println("method");
	}

}
class Be1 extends Para {
	Be1() {

		System.out.println("Constructor nonB");
	}

	Be1(int a) {
		this();
		System.out.println("Constructor B parameterized");
	}
}

class Newclass extends Be1 {
	Newclass() {
		this(10, 20);

		System.out.println("Constructor nonNewclassc");
	}

	Newclass(int a, int b) {
		super(30);
		System.out.println("Constructor Newclass parameterized");
	}

	public static void main(String[] args) {
		Newclass c1 = new Newclass();
		add();
	}
}
