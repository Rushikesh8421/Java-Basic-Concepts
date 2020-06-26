package java_Animals;

public class Animals {
	String type;
	int age ;
	String gender;
	public Animals(String type, int age, String gender) {
		super();
		this.type = type;
		this.age = age;
		this.gender = gender;
	}
	
	public void info() {
		System.out.println("thois animal is "+type);
		System.out.println("It is "+age+" years old");
		System.out.println("Its gender is "+gender);
	}

}
