package somePackage;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Application {

	public static void main(String[] args) {
		BlockingQueue<Integer> blockingQueue = new ArrayBlockingQueue<>(5);
		Thread t1 = new Thread(new Producer(blockingQueue));
		Thread t2 = new Thread(new Consumer(blockingQueue));
		
		t1.start();
		t2.start();
		
		
	}

}
