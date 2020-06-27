package zoo_of_animals;

public class Zoo {

	public static void main(String[] args) {
		Animals animal1 = new Animals(15, "M", 10);
		animal1.eat();
		animal1.sleep();
		
		Birds bird1 = new Birds(5,"F",2);
		bird1.fly();
		bird1.eat();
		bird1.sleep();
		
		Fish fish1 = new Fish(2,"F",1);
		fish1.swim();
		fish1.eat();
		fish1.sleep();
	}

}
