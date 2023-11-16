import ObjectsForBroCourse.car4;

public class Encapsulation {
    
    public static void main(String[] args) {
        
        // Encapsulation    =   attributes of a class will be hidden or private,
        //                  =   can be accessed only through methods (getters & setters)
        //                  =   you should make attributes private if you dont have a reason to make them public/protected

        // getters          =   a method that will give a certain class access to a private info from another class
        // setters          =   a method that will allow you to alter the info of the encapsulated class

        car4 car = new car4("Nissan", "GT-R", 2020);

        // Use getters to print the info
        System.out.println(car.getMake());
        System.out.println(car.getModel());
        System.out.println(car.getYear());

        System.out.println("\n\n");

        // Use setters to alter the info
        car.setyear(2023);
        car.setMake("Tesla");
        car.setModel("Nikola");
            // Use getter to access again the altered info
                System.out.println(car.getMake());
                System.out.println(car.getModel());
                System.out.println(car.getYear());

    }
}
