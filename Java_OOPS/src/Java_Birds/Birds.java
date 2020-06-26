package Java_Birds;

public class Birds {
		int age ;
		String name;
		String Color;
		
		public Birds(int age, String name, String color) {
			super();
			this.age = age;
			this.name = name;
			Color = color;
		}
		
		public void Properties() {
			System.out.println("This bird is "+name);
			System.out.println("It is "+age+" years old");
			System.out.println("It has "+Color+" color");
		}
		
}
