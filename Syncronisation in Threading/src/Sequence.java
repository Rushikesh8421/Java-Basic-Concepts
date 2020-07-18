
public class Sequence {
	private int value = 0;
	public synchronized int getNext() {
//		or you can do synchronised (this) which means same;
		value++;
		return value;
	}

}
