import java.util.Scanner;

public class java4 {

	public static void main(String[] args) {
		
		System.out.println("Hello World");
		
		// Create the Scanner object and pass input stream in it
		Scanner scanner = new Scanner(System.in); // Read data from console and let scanner process it
		
		System.out.println("Enter Your Name: ");
		String name = scanner.nextLine(); // this is to read String
		
		System.out.println("Enter Your Age: ");
		int age = scanner.nextInt(); // to read int
		
		//scanner.nextDouble() i.e. for every data type we have a corresponding next method :)
		
		// With Scanner, we must read Strings before the numbers :)
		// In case we wish to read Strings after numbers, just do an empty nextLine
		
		// scanner.nextLine(); // empty nextLine to read Strings after numbers
		
		System.out.println("Enter your Email: ");
		String email = scanner.nextLine(); //this will not work
		
		
		scanner.close(); // to release the memory resources
		
		System.out.println("Hello "+name+" You are "+age+" years old");
		System.out.println("We will send you an email at "+email);

	}

}
