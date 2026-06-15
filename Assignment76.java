package module;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Assignment76 {
public static void main(String[] args) {
	ArrayList<String> names=new ArrayList<String>();
	names.add("Savita");
	names.add("girija");
	names.add("Pannu");
	names.add("annu");
	names.set(1, "Basu");
	System.out.println(names);
	names.remove(2);
	
	System.out.println(names);
	System.out.println("FARDWARD DIRECTION USING ITERATOR");
	Iterator<String> i1=names.iterator();	
	while(i1.hasNext()) {
		System.out.println(i1.next());
	}
	System.out.println("FARDWARD DIRECTION USING LISTITERATOR");
	ListIterator<String> i2=names.listIterator();	
	while(i2.hasNext()) {
		System.out.println(i2.next());
	}
	System.out.println("BACKWARD DIRECTION USING LISTITERATOR");
		
	while(i2.hasPrevious()) {
		System.out.println(i2.previous());
	}
	
}
}
