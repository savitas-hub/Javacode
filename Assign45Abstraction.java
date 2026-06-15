package module;
abstract class ParentAb{
	abstract void method1();
}

public class Assign45Abstraction extends ParentAb{



	@Override
	void method1() {
		System.out.println("100% Abstraction");
		
	}
	public static void main(String[] args) {
		Assign45Abstraction ab=new Assign45Abstraction();
		ab.method1();
	}
}

