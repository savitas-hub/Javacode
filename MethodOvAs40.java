package module;
class A{
	void add() {
		System.out.println("parent class method");
	}
	
}
public class MethodOvAs40 extends A {
void add() {
	super.add();
	System.out.println("Method override");
}
public static void main(String[] args) {
	MethodOvAs40 mm=new MethodOvAs40();
	mm.add();
	
}
}
