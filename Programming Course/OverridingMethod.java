import ObjectsForBroCourse.Animal;
import ObjectsForBroCourse.Dog;

public class OverridingMethod {
    
    /*      Method Overriding
     *       >  Declaring a method in subclass,
     *          which is already present in a parent class.
     *          done so that a child class can give its own implementation
     */

    public static void main(String[] args) {
        
        Animal animal = new Animal();
        animal.speak();

        Dog dog = new Dog();
        dog.speak();

    }
}
