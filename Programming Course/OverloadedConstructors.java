import ObjectsForBroCourse.Pizza;

public class OverloadedConstructors {
    
    /*  Overloaded Constructors = multiple constructors within a class with the same name,
     *                          = but have different parameters
     *                          = name + parameters = signature                             */

    public static void main(String[] args) {

        Pizza pizzabaking = new Pizza("Thick crust", "Hot Sauce", "Mozzarella", "Pineapple");
        System.out.println("Here are the ingredient for your hawaian pizza!");
        System.out.println(pizzabaking.bread);
        System.out.println(pizzabaking.sauce);
        System.out.println(pizzabaking.cheese);
        System.out.println(pizzabaking.topping);

        System.out.println("\n\n\nHere are the ingredient for your cheeseless-hawaian pizza!");
        System.out.println(pizzabaking.bread);
        System.out.println(pizzabaking.sauce);
        System.out.println(pizzabaking.topping);

    }
}
