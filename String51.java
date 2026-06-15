package module;

public class String51 {
public static void main(String[] args) {
	String name="Savita Shivanaikar";
	String reverse="";
	for(int i=name.length()-1;i>=0;i--) {
	char c=name.charAt(i);
	reverse=reverse+c;

		}
	System.out.println(reverse);
	

	}
}

