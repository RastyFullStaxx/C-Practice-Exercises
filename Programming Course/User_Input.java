package BroCodeCourse;
import java.util.Scanner;

public class User_Input {

	public static void main(String[] args) {
		
		// Declare the scanner to accept user input
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Type in your username: ");	// Prompt
		String name = scanner.nextLine();				// Accept input and assign it to a variable
		
		System.out.println("What is your age?");		// Prompt II
		int age = scanner.nextInt();					// Accept input and assign it to a variable
		
		// Clear the buffer since you previously shifted from getting an integer to string
		scanner.nextLine();
		
		System.out.println("What is your crush? ");		// Prompt III
		String crush = scanner.nextLine();
		
		// Print the data
		System.out.println("Hello " + name + "! It's nice to see you!");
		System.out.println("You are "+age+" years old!");
		System.out.println("Your crush is " + crush);
		
	}

}
