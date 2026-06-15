package module;

import java.util.HashMap;
import java.util.Map;

public class Assignment84 {
public static void main(String[] args) {
    Map<Integer, String> studentMap = new HashMap<>();
    studentMap.put(101, "Rahul");
    studentMap.put(102, "Priya");
    studentMap.put(103, "Amit");

    // 2. Map<String, Double>
    Map<String, Double> salaryMap = new HashMap<>();
    salaryMap.put("Rahul", 45000.50);
    salaryMap.put("Priya", 55000.75);
    salaryMap.put("Amit", 40000.25);

    // 3. Map<Integer, Character>
    Map<Integer, Character> gradeMap = new HashMap<>();
    gradeMap.put(1, 'A');
    gradeMap.put(2, 'B');
    gradeMap.put(3, 'C');

    // 4. Map<String, Boolean>
    Map<String, Boolean> attendanceMap = new HashMap<>();
    attendanceMap.put("Rahul", true);
    attendanceMap.put("Priya", false);
    attendanceMap.put("Amit", true);

    // Print all Maps
    System.out.println("Map<Integer, String>:");
    System.out.println(studentMap);

    System.out.println("\nMap<String, Double>:");
    System.out.println(salaryMap);

    System.out.println("\nMap<Integer, Character>:");
    System.out.println(gradeMap);

    System.out.println("\nMap<String, Boolean>:");
    System.out.println(attendanceMap);
}

}

