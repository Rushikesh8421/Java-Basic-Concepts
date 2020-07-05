package practise;

public class Vehicle {
	String make;
	String model;
	int cost;
	
	
	
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public Vehicle(String make, String model, int cost) {
		super();
		this.make = make;
		this.model = model;
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Vehicle [make=" + make + ", model=" + model + ", cost=" + cost + "]";
	}
	
}
