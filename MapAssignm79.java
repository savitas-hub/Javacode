package module;

import java.util.Enumeration;
import java.util.Vector;

public class MapAssignm79 {
public static void main(String[] args) {
	Vector <String> names=new Vector<String>();
	names.add("veen");
	names.add("banu");
	names.addElement("Savita");
	names.addElement("kavita");
	names.addElement("avita");
	names.addElement("kaita");
	names.addElement("avita");
	names.addElement("kita");
	names.addElement("ata");
	int capacty=names.capacity();
	System.out.println(capacty);
	System.out.println(names.size());
	System.out.println(names);
	names.removeElement("kavita");
	System.out.println(names);
	names.removeElementAt(2);
	System.out.println(names);

	System.out.println(names.contains("kavita"));
	names.set(3, "prabhu");
	System.out.println(	names);

	Enumeration e1=names.elements();
	while(e1.hasMoreElements()) {
		System.out.println(e1.nextElement());
	
	}
}
}
