package practise;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

public class Rush {

	public static void main(String[] args){
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("How are you");
		arr.add("Hello World");
		arr.add("Hi there");
		String use = arr.get(1);
		System.out.println(use);
		
		LinkedList<Integer> link = new LinkedList<Integer>();
		link.add(33);
		link.add(44);
		link.add(656);
		link.add(2);
		link.remove();
		for(int lin : link) {
			System.out.println(lin);
		}
		ArrayList<Vehicle> vehicle = new ArrayList<Vehicle>();
		Vehicle car = new Vehicle("Suzuki", "Swift", 5000);
		vehicle.add(new Vehicle("BMW","S1",12000));
		vehicle.add(car);
		vehicle.add(new Vehicle("Honda","City",7000));
		
		for(Vehicle car1 : vehicle) {
		System.out.println(car1);
	}
		HashSet<Animals> animals = new HashSet<Animals>();
		Animals animal1 = new  Animals("Dog",4);
		Animals animal2 = new Animals("Cat",2);
		Animals animal3 = new Animals("Dog",4);
		animals.add(animal1);
		animals.add(animal2);
		animals.add(new Animals("Monkey",6));
		animals.add(animal3);
		
		System.out.println(animal1.hashCode());
		System.out.println(animal3.hashCode());
		
		boolean equ = animal1.equals(animal3);
		System.out.println(equ);
		
		for(Animals ani : animals) {
			System.out.println(ani);
		}
		
		
		
		
		
		
		
		
  }
}
