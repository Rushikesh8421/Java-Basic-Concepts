package generics_exampel_usingSets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MainClass {

	public static void main(String[] args) {
		Set<String> good = new HashSet<>();
		good.add("Hello world");
		good.add("Good Morning");
		good.add("Machine");
		
		Set<String> bad = new HashSet<>();
		good.add("Hello world");
		good.add("Good Morning");
		good.add("Computer!!");
		
		Set<String> resultSet = Union(good, bad);
		Iterator<String> itr = resultSet.iterator();
		while(itr.hasNext()) {
			
			String var = itr.next();
			System.out.println(var);
			
		}

	}
	
	public static <E>Set<E> Union(Set<E> Set1, Set<E> Set2){
		Set<E> result = new HashSet<E>(Set1);
		result.addAll(Set2);
		return result;
	}

}
