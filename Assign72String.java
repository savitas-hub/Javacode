package module;

public class Assign72String {
public static void main(String[] args) {
	StringBuffer sb=new StringBuffer("Automation");
	StringBuffer Sbb=sb.append(" Testing");
	System.out.println(Sbb);
	StringBuffer name=sb.replace(0, 4, "MANUAL ");
	System.out.println(name);
	StringBuffer name2=sb.insert(4, "Auto");
	System.out.println(name2);
	System.out.println(sb.reverse());
	System.out.println(sb.capacity());
}
}
