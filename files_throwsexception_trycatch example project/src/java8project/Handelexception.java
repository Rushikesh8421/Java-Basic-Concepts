package java8project;

public class Handelexception {
		public int sub10(int num) throws Exception{
			if(num<10) {
				throw new Exception("Enter the number greater than 10");
			}
			return num-10;
		}
}
