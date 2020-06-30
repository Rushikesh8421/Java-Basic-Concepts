
public class Customer {
	private String Name;
	private String Address;
	private double CashOnhand;
	
	

	public String getName() {
		return Name;
	}



	public void setName(String name) {
		Name = name;
	}



	public String getAddress() {
		return Address;
	}



	public void setAddress(String address) {
		address+="Queens, New York";
		Address = address;
	}



	public double getCashOnhand() {
		return CashOnhand;
	}



	public void setCashOnhand(double cashOnhand) {
		cashOnhand+=500;
		CashOnhand = cashOnhand;
	}



	public void purchaseCar(Vehicle vehicle, Employee emp, boolean finance) {
		
		emp.handleCustomer(this, finance, vehicle);
		
	}
	
	
	
}
