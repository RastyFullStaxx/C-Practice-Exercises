package BroCodeCourse;

public class Swapping_Variables {

	public static void main(String[] args) {

		String x = "water";
		String y = "Kool-aid";
		
		// Before Swapping
		System.out.println(x);
		System.out.println(y+"\n");
		
		// Swapping
		String temp;	// Create a placeholder
		temp = x;		// Do the Swapping	
		x = y;
		y = temp;
		
		// After Swapping
		System.out.println(x);
		System.out.println(y+"\n\n");
		
		// Exercise
		System.out.println("Practice Exercise:");
		String ako = "Rasty";
		String crush = "Noemi";
		String pHolder;
		
		System.out.println("Si "+ako +" ay crush si "+crush);
		
		pHolder = ako;
		ako = crush;
		crush = pHolder;
		
		System.out.println("Si "+ako +" ay crush si "+crush);
		
		

	}

}
