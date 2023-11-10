package BroCodeCourse;
import java.util.Random;

public class Random_Numbers {

	public static void main(String[] args) {
		
		Random random = new Random();
		
		int x = random.nextInt(6)+1;		//add 1 to cancel out zero
		double y = random.nextDouble();		//generate number between 0 and 1
		boolean z = random.nextBoolean();	//outputs true or false
		
		System.out.println(z);

	}

}
