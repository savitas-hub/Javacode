package module;

import java.util.Date;

public class Assign70 {
public static void main(String[] args) {
	Date d1=new Date();
	System.out.println(d1.getTime());
	Date d2=new Date(d1.getTime()+(1000*60*60*24*7l));
	System.out.println("Future Date After 7days"+d2);
	Date pastDate2=new Date(d1.getTime()-(1000*60*60*24*30l));
	System.out.println("Past Date 30days"+pastDate2);
}
}
