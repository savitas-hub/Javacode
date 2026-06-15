package module;

public class SuperThis {
static int x=10;
public static void main(String[] args) {
	SuperThis st=new SuperThis();
	SuperThis st2=new SuperThis();
	st.x=50;
	System.out.println(st2.x);
}
}

