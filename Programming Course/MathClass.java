package BroCodeCourse;
import java.util.Scanner;

public class MathClass {

	public static void main(String[] args) {
		
		double x = 3.14;
		double y = -10;
		double t = 4.75;
		
		// Max method = find the largest between two numbers
		Double z = Math.max(x, y);	// Assign max to a placeholder
		System.out.println(z);
		
		// Min method = find the smallest between two numbers
		Double i = Math.min(x, y);	// Assign min to a placeholder
		System.out.println(i);
		
		// Absolute Function method = display the absolute value	
		Double j = Math.abs(y);	// Assign abs to a placeholder
		System.out.println(j);
		
		// Square root Function method = square root a number
		Double r = Math.sqrt(x);	// Assign sqrt to a placeholder
		System.out.println(r);
		
		// Round Function method = rounds a number
		long s = Math.round(t);	// Assign round to a placeholder
		System.out.println(s);
		
		// Ceiling Round Function method = rounds a number up
		double v = Math.ceil(t);	// Assign round to a placeholder
		System.out.println(v);
		
		// Floor Round Function method = rounds a number down
		double u = Math.floor(t);	// Assign round to a placeholder
		System.out.println(u);
		
		
		
		
		// Solve the Hypotenuse
		Scanner scanner = new Scanner(System.in);
		
		// Get inputs
		System.out.println("Enter value for side a: ");
		double a = scanner.nextDouble();
		System.out.println("Enter value for side b: ");
		double b = scanner.nextDouble();
		
		// Show Inputs
		System.out.println("Side a: " + a + " cm");
		System.out.println("Side b: " + b + " cm");
				
		// Formula
		double result = Math.pow(a,2) + Math.pow(b,2);
		
		// Print
		System.out.println("Side a is " + a + ", b is " + b + ".\n Therefore, the hypotenuse is " + result);
		
		// Close Scanner
		scanner.close();
	}

}
