package somepakage;

import java.util.ArrayList;
import java.util.List;

public class Application {

	public static void main(String[] args) {
		
		List<Integer> newList = new ArrayList<>();
		
		Thread t1 = new Thread( new Producer(newList));
		Thread t2 = new Thread( new Consumer(newList));

		t1.start();
		t2.start();
	}

}
