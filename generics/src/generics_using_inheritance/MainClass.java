package generics_using_inheritance;

import java.util.ArrayList;
import java.util.List;

public class MainClass {

	public static void main(String[] args) {
		ArrayList<Employee> emp = new ArrayList<>();
		emp.add(new Employee());
		ArrayList<Accountant> acc = new ArrayList<>();
		acc.add(new Accountant());
		
		makeWork(emp);
		makeWork(acc);
	}
	
	public static void makeWork(List<? extends Employee> emp) {
		
		for(Employee e : emp) {
			e.work();
		}
		
	}

}
