package java8project;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

			

		File file = new File("my_file.txt");
		Scanner input;
		try {
			input = new Scanner(file);
			
			while (input.hasNextLine()) {

				String line = input.nextLine();
				System.out.println(line);
			}
			input.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("Opps,File not Found!!");

		}
		
		Handelexception handel1 = new Handelexception();
		try {
			
			System.out.println(handel1.sub10(15));
			
		} catch (Exception e) {
//			System.out.println("Enter the correct number");
			e.printStackTrace();
		}

	}

}
