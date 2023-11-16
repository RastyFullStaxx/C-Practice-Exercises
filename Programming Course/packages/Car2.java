package ObjectsForBroCourse;

public class Car2 {
    
    // Car Attributes [characteristics]
    public String make = "Nissan";
    public String model = "GT-R";
    public int year = 2020;
    public String color = "red";
    public double price = 50000.00;

    // Method Overriding
    public String toString() {

        /* 
        String myString = make + " " + model + "\n" + color + "\n" + year;  
        return myString;    */

        // or 

        return make + " " + model + "\n" + color + "\n" + year;

    }

}
