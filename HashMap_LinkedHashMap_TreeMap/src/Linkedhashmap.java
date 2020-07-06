
import java.util.LinkedHashMap;
import java.util.Map;

public class Linkedhashmap {
	
//	In LinkedHashMap we get output in order of insertion of Statements

	public static void main(String[] args) {
		LinkedHashMap<String, String> hashmap = new LinkedHashMap<String,String>();
		hashmap.put("Power", "Amount of Energy transfered per unit time");
		hashmap.put("Energy", "Capacity to do work");
		hashmap.put("Current","Rate of flow of electric charge");
		
		for(Map.Entry<String, String> entry : hashmap.entrySet()) {
			
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
			
		}

	}

}
