import ObjectsForBroCourse.Human;

public class Constructors {
    public static void main(String[] args) {
        
        // Constructor = is special method that is called when an object is instantiated

        /*
         * Constructor helps create reusable objects that can have different qualities set
         */

        Human humanObject1 = new Human("Rasty", 20, 50);
        System.out.println(humanObject1.name);
        humanObject1.eat();
        humanObject1.drink();
        
        Human humanObject2 = new Human("Noemi", 19, 47);
        System.out.println(humanObject2.name);
        humanObject2.eat();
        humanObject2.drink();

    }
}
