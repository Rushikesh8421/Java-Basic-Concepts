package somepakage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class InventoryManager {
	List<Product> soldProductList = new CopyOnWriteArrayList<>();
	List<Product> purchasedProductList = new ArrayList<>();
	
	public void populateSoldProducts() {
		for(int i = 0; i<1000; i++ ) {
			Product prod = new Product(i, "test_name_ "+i);
			soldProductList.add(prod);
			System.out.println("ADDED "+prod);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}
	public void displaySoldProducts() {
		
		for(Product product : soldProductList) {
			System.out.println("PRINT THE SOLD "+ product);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		
	}
}
