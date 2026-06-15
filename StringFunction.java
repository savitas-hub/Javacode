package module;

public class StringFunction {
public static void main(String[] args) {
	String name="Auto testing1";
	//check my string ends with o
	boolean a=name.matches("(.*)o");
	System.out.println(a);
	String b=name.replace("A","a");
	System.out.println(b);
	String c=name.replaceAll("Auto", "Automation");
	System.out.println(c);
	String d=name.replace("[a-z]","");
	System.out.println(d);
	String e=name.replaceFirst("[a-z]", "t");
	System.out.println(e);
}
}
