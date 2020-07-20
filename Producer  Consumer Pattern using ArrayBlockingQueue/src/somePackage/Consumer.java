package somePackage;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {

	BlockingQueue<Integer> questionQueue;

	public Consumer(BlockingQueue<Integer> questionQueue) {
		super();
		this.questionQueue = questionQueue;
	}

	@Override
	public void run() {
		while (true) {
			try {
				Thread.sleep(1000);
				System.out.println("ANSWEREDQuestion: " + questionQueue.take());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
