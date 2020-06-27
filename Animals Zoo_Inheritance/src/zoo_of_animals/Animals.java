package zoo_of_animals;

public class Animals {
	
	int age;
	String gender;
	int weight;
	
	
	
	public Animals(int age, String gender, int weight) {
		super();
		this.age = age;
		this.gender = gender;
		this.weight = weight;
	}
	
	public void sleep() {
		System.out.println("Sleeping...");
	}

	public void eat() {
		System.out.println("Eating...");
	}
}
