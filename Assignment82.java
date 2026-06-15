package module;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Assignment82 {

	public static void main(String[] args) {
		Collection<Integer> marks = new ArrayList<Integer>();
		marks.add(80);

		marks.add(70);
		marks.add(60);

		marks.add(90);

		marks.add(50);
		
		
		Collection<Integer> num = new ArrayList<Integer>();
		num.add(20);
		num.add(40);
		num.add(78);
		num.addAll(marks);
		boolean b=num.containsAll(marks);
		System.out.println(b);
		Iterator<Integer> c1=        num.iterator();
        while(c1.hasNext())
        {
                System.out.println(c1.next());
        }
        System.out.println("\nNumbers Collection: " + num);

        // contains()
        System.out.println("\nContains 90? " + marks.contains(90));

        // containsAll()
        System.out.println("Contains all numbers? "
                + marks.containsAll(num));

        // size()
        System.out.println("Size of marks collection: "
                + marks.size());

        // addAll()
        marks.addAll(num);
        System.out.println("After addAll(): " + marks);

      marks.remove(90);
      System.out.println("remove 90"+ marks);

        // removeAll()
        marks.removeAll(num);
        System.out.println("After removeAll(numbers): "
                + marks);

        // equals()
        System.out.println("marks equals numbers? "
                + marks.equals(num));

        // clear()
        marks.clear();
        System.out.println("After clear(): " + marks);

        // isEmpty()
        System.out.println("Is marks empty? "
                + marks.isEmpty());
    }

	}

