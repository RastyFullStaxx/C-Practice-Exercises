
package BroCodeCourse;
import java.util.Scanner;


public class If_Statements {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("How old are you? ");
		int age = scanner.nextInt();
		
		if (age >= 60) {
			System.out.println("Take care of your health, okay?");
		} else if (age >= 18) {
			System.out.println("You are in the legal age!");
		}
		else {
			System.out.println("Go home kid.");
		};
		

	}

}
