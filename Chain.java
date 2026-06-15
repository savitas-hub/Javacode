package module;

 class Chain {
Chain(int a, double b,char c){
	System.out.println("1");
}
Chain (String a){
	this(10,30.6667,'x');
	System.out.println("2");
}
}
 
	
class k3 extends Chain{
	k3(){
		super("savita");
	System.out.println("3");	
	}
	k3(int a){
		this();
	System.out.println("4");	
	}
	}
 class k1 extends k3{
	
	k1(int a){
		super(20);
		System.out.println("5");
	}
	public static void main(String[] args) {
		new k1(10);
	}
}
