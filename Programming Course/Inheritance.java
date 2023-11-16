import ObjectsForBroCourse.Bicycle;
import ObjectsForBroCourse.CarZz;

public class Inheritance {
    
    public static void main(String[] args) {
        
        // Inheritance = the process where one class acquires,
        //               the others attirbutes and methods of another

        CarZz car = new CarZz();
        car.go();
        car.stop();

        Bicycle bike = new Bicycle();
        bike.go();
        bike.stop();

        System.out.println(car.speed);
        System.out.println(car.wheels);
        System.out.println(car.doors);

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

        System.out.println(bike.speed);
        System.out.println(bike.wheels);
        System.out.println(bike.pedals);

    }

}
