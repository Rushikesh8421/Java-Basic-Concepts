
public class Employee {
	
	public void handleCustomer(Customer cust, boolean finance, Vehicle vehicle) {
		if(finance==true) {
			double loanAmount = vehicle.getPrice() - cust.getCashOnhand();
			runCreditHistory(cust, loanAmount);
		}
		
		else if(vehicle.getPrice()<=cust.getCashOnhand()) {
			processTransaction(cust,vehicle);
		}
		else {
			System.out.println("Customer will need more money to purchase the Vehicle");
		}
		
	}
	
	public  void runCreditHistory(Customer cust, double loanAmount) {
			System.out.println("ran credit history for customer...");
			System.out.println("customer have been aproved to purchase the vehicle!!");
	}
	
	public void processTransaction(Customer cust,Vehicle vehicle) {
		System.out.println("Customer has purchased the vehicle: "+vehicle+" for the price "+vehicle.getPrice());
	}
	
}
