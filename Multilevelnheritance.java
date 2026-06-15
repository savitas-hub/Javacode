package module;

public class Multilevelnheritance {
	void sub() {
		System.out.println("Method is addition Superparent class");
	}
}

class B extends Multilevelnheritance {

	static void add() {
		System.out.println("Method is additionparent class");
	}
}
	class C extends B {
		static void mul() {

		}

		void dic() {
			System.out.println("Method is Division");
		}

		public static void main(String[] args) {
			
			mul();
			B.add();
		C c1=new C();
		c1.dic();

			Multilevelnheritance Multi = new Multilevelnheritance();
			Multi.sub();
		}

	}
