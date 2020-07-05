package practise;

import java.util.ArrayList;

public class methods {

	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add(22);
		list1.add(12);
		list1.add(11);
		list1.add(21);
		list1.add(3);
		list1.add(56);
		list1.add(10);
		list1.add(10);
		list1.add(10);
		list1.add(10);
		
		ArrayList<Integer> newList = new ArrayList<Integer>();
		newList.add(10);
		newList.add(11);
		newList.add(99);
		newList.add(3);
		newList.add(21);
		
//		comment out one by one below methods to know their working and comment in the previous one
		
		list1.retainAll(newList);
		
//		boolean empty = list1.isEmpty();
//		System.out.println(empty);
//		
//		boolean hasValue = list1.contains(21);
//		System.out.println(hasValue);
//		
//		list1.addAll(newList);
//		
//		System.out.println(list1);
//		
//		list1.removeAll(newList);
//		
//		list1.clear();
//		
//		boolean empty1 = list1.isEmpty();
//		System.out.println(empty1);
		
		System.out.println(list1);

	}

}
