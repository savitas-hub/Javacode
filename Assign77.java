package module;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Assign77 {
public static void main(String[] args) {
	List<Integer> ids=new ArrayList<Integer>();
	ids.add(20);
	ids.add(21);
	ids.add(22);
	ids.add(23);
	ids.add(24);
	ids.add(1, 25);
	System.out.println(ids);
	ids.remove(4);
	System.out.println(ids);
	boolean idcheck=ids.contains(22);
	System.out.println(idcheck);
	Iterator<Integer> i1=ids.iterator();
	while(i1.hasNext()) {
		System.out.println(i1.next());
	}
	Integer i2=ids.get(3);
	System.out.println(i2);
}

}
