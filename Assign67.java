package module;

public class Assign67 {
	static int charcter=0;
	static int charctersp=0;
public static void main(String[] args) {
	String str="My name is Savita kk";
	char[] c1=str.toCharArray();
	for(int i=0;i<str.length();i++) {
	boolean b=	Character.isAlphabetic(c1[i]);
	
	System.out.println(b);
	if(b) {
		charcter++;
		System.out.println(charcter);
	}

		boolean b1=	Character.isWhitespace(c1[i]);
		
		System.out.println(b1);
		if(b1) {
			charctersp++;
			System.out.println(charcter);
		}
	}
	if(charcter+charctersp==str.length()) {
	System.out.println("Given String is Alphabetic");
	}else {
		System.out.println("Given String is NonAlphabetic");	
}
}
}
