package ObjectsForBroCourse;
import java.util.Random;

public class DiceRoller {
    
    Random randomNum;
    int number = 0;

    public DiceRoller(){
        randomNum = new Random();
        roll();
    }

    public void roll(){
        number = randomNum.nextInt(6)+1;
        System.out.println(number);
    }

}
