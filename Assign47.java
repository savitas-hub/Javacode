package module;

class GrandParent {
	static void add() {
		System.out.println("Addition Method");
	}
}

abstract class Parent extends GrandParent {
	abstract void add(int a, int b);

}

public class Assign47 extends Parent {

	public static void main(String[] args) {
		Assign47 ab = new Assign47();
		ab.add();
		ab.add(10, 20);
	}

	void add(int a, int b) {
		int c = a + b;
		System.out.println("Abstract Method" + c);
	}

}
