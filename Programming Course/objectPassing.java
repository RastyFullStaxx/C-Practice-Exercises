import ObjectsForBroCourse.Garage;
import ObjectsForBroCourse.garageCars;

public class objectPassing {
    public static void main(String[] args) {
        
        Garage garage = new Garage();

        garageCars garageCars = new garageCars("BMW Sedan");
        garageCars garageCars2 = new garageCars("Ducatti");
        garageCars garageCars3 = new garageCars("Lambo");

        garage.park(garageCars);
        garage.park(garageCars2);
        garage.park(garageCars3);

    }
}
