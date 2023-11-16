import ObjectsForBroCourse.Car;

public class Objects {
    public static void main(String[] args) {
        
        // objects = an instance of class the contains attributes (characteristics) and methods
        // example: (phones, cars, cup, computer)

        // Creating the instance of the Car class
        Car myCar = new Car();
        
        // Accessing the attribute and printing it
        System.out.println(myCar.make + " " + myCar.model);
        System.out.println(myCar.year);
        System.out.println(myCar.color);
        System.out.println(myCar.price);

        // Calling the methods
        myCar.drive();
        myCar.drift();
        myCar.brake();


        // Reusing the Car class
        Car mySecondCar = new Car();
        System.out.println(mySecondCar.model);

    }
}
