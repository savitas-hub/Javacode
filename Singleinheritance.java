package module;

class Singleinheritance {
	void sub() {
		System.out.println("savita parent class");
	}
}

class b extends Singleinheritance {

	static void add() {
		System.out.println("savita child class");
	}

	public static void main(String[] args) {
		add();
		Singleinheritance b1 = new Singleinheritance();
		b1.sub();

	}
}
