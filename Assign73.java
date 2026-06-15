package module;

public class Assign73 {
public static void main(String[] args) {
	StringBuilder sb=new StringBuilder("Auto");
	System.out.println(sb.capacity());
	System.out.println(sb.insert(0, "Qa "));
	System.out.println(sb.append(" mation"));

	System.out.println(sb.replace(0, 4, "Manual "));
	System.out.println(sb.reverse());
	StringBuilder sbb=new StringBuilder("waterbattel");
	System.out.println(sbb.delete(0, 5));
	

	
}
}
