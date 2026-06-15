package module;

interface Ab {
	void add();
}

interface Bb extends Ab {
	void sub();

}

interface Cc extends Bb {
	void mult();
}

public class MultipleInheritance implements Cc {

	public void sub() {
System.out.println("Method A from Interface");
	}

	public void add() {
		System.out.println("Method B from Interface");
	}

	public void mult() {
		System.out.println("Method C from Interface");
	}
public static void main(String[] args) {
	MultipleInheritance MI=new MultipleInheritance();
	MI.add();
	MI.sub();
	MI.mult();
}
}
