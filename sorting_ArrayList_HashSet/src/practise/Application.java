package practise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Application {

	public static void main(String[] args) {
		
		HashSet<Employee> employee = new HashSet<Employee>();
		employee.add(new Employee("Pratham", 12000, "CSE"));
		employee.add(new Employee("Raj", 10000, "IT"));
		employee.add(new Employee("Kedar", 15000, "ECE"));
		
		ArrayList<Employee> list1 = new ArrayList<Employee>(employee);
		
		Collections.sort(list1);
		
		System.out.println(list1);
		
	}

}
