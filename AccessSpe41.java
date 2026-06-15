package module;

public class AccessSpe41 {
public static int a=10;
private static int b=20;
protected  static double c=23.00;
static long  l=8888l;

public static void add() {
	System.out.println("add");
}
private static void sub() {
	System.out.println("sub");
	
}
protected static void mul() {
	System.out.println("mul");
	
}
 static void div() {
	System.out.println("div");
	
}
public static void main(String[] args) {
	System.out.println(l);
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	add();
	sub();
	mul();
	div();
	
}
}
