package module;

public class Constru {
	Constru() {
		System.out.println("Constructor");
	}

	Constru(int a) {
		System.out.println("parameterized constructor");
	}

	public static void name() {
		System.out.println("My Name is savita");
	}

	static void age() {
		System.out.println("My age is 27");
	}

	public static void main(String[] args) {
		Constru cs = new Constru();
		new Constru(27);
		name();
		age();

	}
}
