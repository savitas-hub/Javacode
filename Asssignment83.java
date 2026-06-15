package module;

import java.util.ArrayList;
import java.util.Collections;

public class Asssignment83 {

	public static void main(String[] args) {
		ArrayList<String> name= new ArrayList<String>();
		name.add("savita");
		name.add("kavita");
		name.add("avita");
		name.add("tavita");
		System.out.println(name);
		ArrayList<Integer> salary= new ArrayList<Integer>();
		salary.add(9000);
		salary.add(5000);
		salary.add(6000);
		salary.add(7000);
	
		// 3. Print all names
        System.out.println("Employee Names:");
        for (String empname : name) {
            System.out.println(empname);
        }

        // 4. Sort names alphabetically
        Collections.sort(name);
        System.out.println("\nAfter Sorting:");
        System.out.println(name);

        // 5. Reverse the names
        Collections.reverse(name);
        System.out.println("\nAfter Reversing:");
        System.out.println(name);

        // 6. Check whether a particular employee exists
        String searchName = "Priya";
        if (name.contains("searchName")) {
            System.out.println("\n" + searchName + " is present.");
        } else {
            System.out.println("\n" + searchName + " is not present.");
        }

        // 7. Shuffle names in random order
        Collections.shuffle(name);
        System.out.println("\nAfter Shuffling:");
        System.out.println(name);



        System.out.println("\nSalary List:");
        System.out.println(salary);

        // Maximum Salary
        int maxSalary = Collections.max(salary);
        System.out.println("Maximum Salary: " + maxSalary);

        // Minimum Salary
        int minSalary = Collections.min(salary);
        System.out.println("Minimum Salary: " + minSalary);
    }
		
	}

