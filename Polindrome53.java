package module;

public class Polindrome53 {
public static void main(String[] args) {
	String name="MoM";
	String reverse1="";
	for(int i=name.length()-1;i>=0;i--) {
		char c=name.charAt(i);
	 reverse1=reverse1+c;
		
	}
	System.out.println(reverse1);
	if(name.equals(reverse1)) {
		System.out.println("Its Polindrome");
	}else {
	System.out.println("Its not Polindrome");
}
}
}
