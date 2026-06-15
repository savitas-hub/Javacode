package module;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Assign81 {
	public static void main(String[] args) {
		Set<Integer>i1=new HashSet<Integer>();
		i1.add(10);
		i1.add(10);
		i1.add(20);
		i1.add(10);
		i1.add(30);
		System.out.println("NoTFollowing Indexing"+i1);
		List<Integer> i2=new ArrayList<Integer>(i1);
		i2.add(10);
		i2.add(10);
		i2.add(20);
		System.out.println(" Following Indexing"+i2);
		
	}
	}

