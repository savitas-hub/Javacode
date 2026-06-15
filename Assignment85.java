package module;

import java.util.HashMap;
import java.util.Map;

public class Assignment85 {
  public static void main(String[] args) {
	
	       
	          HashMap<Integer, String> emp = new HashMap<>();

	          // Add elements using put()
	          emp.put(101, "Rahu");
	          emp.put(102, "Priya");
	          emp.put(103, "Amit");

	          System.out.println("Employee Map:");
	          System.out.println(emp);

	       
	          emp.putIfAbsent(104, "Sneha");
	          emp.putIfAbsent(101, "Karan"); // Will not be added

	          System.out.println("\nAfter putIfAbsent():");
	          System.out.println(emp);

	          // Create another HashMap and copy elements using putAll()
	          HashMap<Integer, String> empCopy = new HashMap<>();
	          empCopy.putAll(emp);

	          System.out.println("\nCopied Map:");
	          System.out.println(empCopy);

	          // Remove an element using remove()
	          emp.remove(103);

	          System.out.println("\nAfter remove(103):");
	          System.out.println(emp);

	          // containsKey()
	          System.out.println("\nContains Key 102? "
	                  + emp.containsKey(102));

	          // containsValue()
	          System.out.println("Contains Value 'Priya'? "
	                  + emp.containsValue("Priya"));

	          // get()
	          System.out.println("Employee Name for ID 101: "
	                  + emp.get(101));

	          // size()
	          System.out.println("Size of Map: "
	                  + emp.size());

	          // Traversal using keySet()
	          System.out.println("\nTraversal using keySet():");
	          for (Integer key : emp.keySet()) {
	              System.out.println(key);
	          }

	          // Traversal using values()
	          System.out.println("\nTraversal using values():");
	          for (String value : emp.values()) {
	              System.out.println(value);
	          }

	          // Traversal using entrySet()
	          System.out.println("\nTraversal using entrySet():");
	          for (Map.Entry<Integer, String> entry : emp.entrySet()) {
	              System.out.println(
	                      entry.getKey() + " = " + entry.getValue());
	          }

	          // clear()
	          emp.clear();

	          System.out.println("\nAfter clear():");
	          System.out.println(emp);

	          // isEmpty()
	          System.out.println("Is Map Empty? "
	                  + emp.isEmpty());
	      }
	  
}

