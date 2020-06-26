package java_Human;

public class Human {
	int heightInInches;
	String Name;
	int age;
	String eyeColor;
	
	public Human(int heightInInches, String name, int age, String eyeColor) {
		super();
		this.heightInInches = heightInInches;
		Name = name;
		this.age = age;
		this.eyeColor = eyeColor;
	}

	public void speak() {
		System.out.println("Hello my name is "+Name);
		System.out.println("I am "+heightInInches+" inches tall");
		System.out.println("I am "+age+" years old");
		System.out.println("My eye color is "+eyeColor);
	}

}
