import java.util.HashMap;
import java.util.Map;

public class Hashmap {
	
//	In HashMap we output in random order of insertion

	public static void main(String[] args) {
		HashMap<String, String> hashmap = new HashMap<String,String>();
		hashmap.put("Power", "Amount of Energy transfered per unit time");
		hashmap.put("Energy", "Capacity to do work");
		hashmap.put("Current","Rate of flow of electric charge");
		
		for(Map.Entry<String, String> entry : hashmap.entrySet()) {
			
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
			
		}

	}

}
