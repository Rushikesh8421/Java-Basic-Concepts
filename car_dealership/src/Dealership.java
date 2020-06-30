
public class Dealership {

	public static void main(String[] args) {
		
		Customer cust1 = new Customer();
		cust1.setName("Tom");
		cust1.setAddress("Something 112 street");
		cust1.setCashOnhand(12000);
		
		Vehicle vehicle = new Vehicle("BMW", "M3", 10000);
		
		
		Employee emp = new Employee();
		
		Vehicle car = new Vehicle("BMW", "M3", 10000);
		
		boolean comp = car.equals(vehicle);
		
		cust1.purchaseCar(vehicle, emp, false);
		System.out.println(comp);
	}

}
