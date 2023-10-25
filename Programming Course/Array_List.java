import java.util.ArrayList;

public class Array_List {
    public static void main(String[] args){
       
    //  Array List  =   a resizable array.
    //                  Elements can ba added and removed after compilation phase
    //                  stores reference data types
    
    // Reminders!! 
    // *Use wrapper class instead of primitive data type            

    // Create the Array list
    ArrayList<String> food = new ArrayList<String>();

    // Add elements using the add function
    food.add("Pizza");
    food.add("Hamburger");
    food.add("Hotdogs");

    // We can replace another element over an existing element: (index, element)
    food.set(0, "Krabby Patty");

    // We can remove a value from an index: (index)
    food.remove(2);

    // Clears the array list
    food.clear();

    // Print the elements using loop
    for (int i=0; i<food.size(); i++){
        System.out.println(food.get(i));            // uses get to iterate each item
    } System.out.println("\n\n\n");

    }
}
