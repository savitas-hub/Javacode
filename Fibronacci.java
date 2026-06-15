package module;

public class Fibronacci {
	public static void main(String[] args) {
		int a=0,b=1,c;
		int n=5;
		for(int i=0;i<=n;i++) {
			c=a+b;
			System.out.println(c);
			a=b;

			b=c;
	
		}
	}

}
