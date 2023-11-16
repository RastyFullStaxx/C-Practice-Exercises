import ObjectsForBroCourse.Food;
public class arrayofObjects {
    public static void main(String[] args) {

    // array formula = dataType[] arrayname = new dataType[arraysize];
        // standard array 
        /* 
        int[] numbers = new int[4];
        char[] characters = new char[4];
        String[] strings = new String[5]; */

        // object array = objectClass[] arrayName = new objectClass[arraySize]
        //Food[] refrigerator = new Food[3];

        // creating the objects
        Food food1 = new Food("Pizza");
        Food food2 = new Food("Hamburger");
        Food food3 = new Food("Hotdog");

        Food[] refrigerator = {food1, food2, food3};
        
        //refrigerator[0] = food1;
        //refrigerator[1] = food2;
        //refrigerator[2] = food3;

        System.out.println(refrigerator[0].name);
        System.out.println(refrigerator[1].name);
        System.out.println(refrigerator[2].name);

    }
}
