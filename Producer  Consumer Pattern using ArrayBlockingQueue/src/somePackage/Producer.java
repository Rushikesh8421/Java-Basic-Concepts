package somePackage;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {
	int questionNo;

	BlockingQueue<Integer> questionQueue;

	public Producer(BlockingQueue<Integer> questionQueue) {
		super();
		this.questionQueue = questionQueue;
	}

	@Override
	public void run() {
		while (true) {
			try {
				synchronized (this) {
					int nextQuestion = questionNo++;
					System.out.println("got New Question: " + nextQuestion);
					questionQueue.put(nextQuestion);
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
