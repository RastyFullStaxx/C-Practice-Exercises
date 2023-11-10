package BroCodeCourse;
import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Today is? ");
		String day = scanner.nextLine();		
		
		switch(day) {
			case "Sunday": System.out.println("Today is " + day);
			break;
			
			case "Monday": System.out.println("Today is " + day);
			break;
			
			case "Tuesday": System.out.println("Today is " + day);
			break;
			
			case "Wednesday": System.out.println("Today is " + day);
			break;
			
			case "Thursday": System.out.println("Today is " + day);
			break;
			
			case "Friday": System.out.println("Today is " + day);
			break;
			
			case "Saturday": System.out.println("Today is " + day);
			break;
			
			default: System.out.println("You entered " + day + " which is an invalid day");
			break;
		}
		
	}

}
