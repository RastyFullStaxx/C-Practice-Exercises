import ObjectsForBroCourse.Car2;

public class toString_Method {
    
    /* toString Method
     *  > a special method that all objects inherit, that returns a string that 'textually represent' an objects
     *  > can be used both implicitly and explicitly                                                              */

    public static void main(String[] args) {
        
       
        Car2 car = new Car2();
        /*
        System.out.println(car.make + " " + car.model);
        System.out.println(car.year);
        System.out.println(car.color);
        */

        System.out.println(car);                                // implicitly (default)
        System.out.println("\n\n\n");
        System.out.println(car.toString());                     // explicitly


    }
}
