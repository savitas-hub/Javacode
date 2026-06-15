package module;

public class Person {
	static void add() {
		System.out.println("Super parent Class");
	}

	void multi() {
		System.out.println("Non Static Method sub parent class");
	}
}

class Student extends Person {
	static void div() {
		System.out.println(" parent Class");
	}
}

class Class extends Student {
	static void sub() {
		System.out.println("  sub parent Class");
	}
	void multi2() {
		System.out.println("Non Static Method sub parent class 2");
	}

}

class Teacher extends Person {
	static void mul() {
		System.out.println("child Class");
	}

	public static void main(String[] args) {
		mul();
		Class.sub();
		Teacher t1 = new Teacher();
		t1.multi();
		Class c1=new Class();
		c1.multi2();
		

	}
}
