package module;

public class Newmethod extends MethodOverrid{
 void add() {
	System.out.println("override");
}
public static void main(String[] args) {
	Newmethod mm=new Newmethod();
	mm.add();
}
}
