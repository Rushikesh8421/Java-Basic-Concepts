
public class MainFunc {

	public static void main(String[] args) {
		System.out.println("Starting first Thread");
//		Task task1 = new Task("Thread-A");
//		Thread t1 = new Thread(new Task("Thread-A"));
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
//				Thread.currentThread().setName(name);
				for(int i=0;i<1001;i++) {
					System.out.println("Number: "+i+" - "+Thread.currentThread().getName());
					try {
						Thread.sleep(3);
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
				}
				
			}
			
		});
		t1.start();
		
		System.out.println("Starting second Thread");
//		Task task2 = new Task("Thread-B");
//		Thread t2 = new Thread(new Task("Thread-B"));
		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
//				Thread.currentThread().setName(name);
				for(int i=0;i<1001;i++) {
					System.out.println("Number: "+i+" - "+Thread.currentThread().getName());
					try {
						Thread.sleep(3);
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
				}
				
			}
			
		});
		t2.start();

	}

}

class Task implements Runnable{
	
	String name;
	
	public Task(String name) {
		super();
		this.name = name;
	}



	public void run() {
		Thread.currentThread().setName(name);
		for(int i=0;i<1001;i++) {
			System.out.println("Number: "+i+" - "+Thread.currentThread().getName());
			try {
				Thread.sleep(3);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}
}