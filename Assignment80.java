package module;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Assignment80 {
public static void main(String[] args) {
	List<Integer> i1=new ArrayList<Integer>();
	i1.add(10);
	i1.add(10);
	i1.add(20);
	i1.add(10);
	i1.add(30);
	System.out.println("Following Indexing"+i1);
	Set<Integer>i2=new HashSet<Integer>(i1);
	System.out.println("Not Following Indexing"+i2);
	
}
}
