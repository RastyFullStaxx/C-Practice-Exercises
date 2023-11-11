//  creating a an object (instantiation)
//  className objectName = new className()  

// Define a class called Car
class Car {

    // Attributes
    String model;
    int year;

    // Method to display information about the car
    void displayInfo() {
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}

public class Main {
    public static void main(String[] args) {

        // Create an object of the Car class
        Car myCar = new Car();

        // Set values for the attributes
        myCar.model = "Toyota";
        myCar.year = 2022;

        // Call the method to display information about the car
        myCar.displayInfo();
    }
}
