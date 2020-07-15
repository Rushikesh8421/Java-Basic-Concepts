package generics_assigning_own_datatype;

public class Client {

	public static void main(String[] args) {
		Container<String,Integer> cont1 = new Container<String,Integer>("Bad Boys", 22);
			String var = cont1.getItem1();
			int var2 = cont1.getItem2();
			System.out.println(var);
			System.out.println(var2);
			cont1.printItem();
		
		Container<Double,String> cont2 = new Container<Double,String>(22.25,"For Life");
			Double gm = cont2.getItem1();
			String mm = cont2.getItem2();
			System.out.println(gm);
			System.out.println(mm);
			cont2.printItem();
	}

}
