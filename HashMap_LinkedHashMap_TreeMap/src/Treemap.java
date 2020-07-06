
import java.util.Map;
import java.util.TreeMap;

public class Treemap {
	
//	In TreeMap it gives output in naturally sorted manner

	public static void main(String[] args) {
		TreeMap<String, String> hashmap = new TreeMap<String,String>();
		hashmap.put("Power", "Amount of Energy transfered per unit time");
		hashmap.put("Energy", "Capacity to do work");
		hashmap.put("Current","Rate of flow of electric charge");
		
		for(Map.Entry<String, String> entry : hashmap.entrySet()) {
			
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
			
		}

	}

}
