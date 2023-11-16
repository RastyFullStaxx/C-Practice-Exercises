import ObjectsForBroCourse.DiceRoller;

public class VariableScope {
    public static void main(String[] args) {
        
        /*  Local Variables
         *      > declared inside a method
         *      > visible only to method    */

        /*  Global Variables
         *      > declared outside a method, but within the class
         *      > visible only to all parts of the class    */         

        DiceRoller roll_Dice = new DiceRoller();
        roll_Dice.roll();
        

    }
}
