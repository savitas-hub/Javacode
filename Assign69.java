package module;

import java.util.Date;

public class Assign69 {
public static void main(String[] args) {
	Date d1=new Date();
	Date d2=new Date(d1.getTime());
	String currentdate=d2.toString();
	String Date=currentdate.substring(4, 20);
	System.out.println(d1);
	System.out.println(Date);
}
}
