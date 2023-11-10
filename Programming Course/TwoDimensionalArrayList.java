import java.util.*;

public class TwoDimensionalArrayList {
    public static void main(String[] args){
        
    // 2D Array =   A sizable 2d list
    //              You can change the size of these lists during runtime

    // Create the 2D Array List
    ArrayList<ArrayList<String>> groceryList = new ArrayList<>();

    ArrayList<String> bakeryList = new ArrayList<>();
    bakeryList.add("pasta");
    bakeryList.add("garlic bread");
    bakeryList.add("donuts");

    ArrayList<String> produceList = new ArrayList<>();
    produceList.add("tomatoes");
    produceList.add("peppers");
    produceList.add("red bell pepper");

    ArrayList<String> drinkList = new ArrayList<>();
    drinkList.add("milk");
    drinkList.add("beer");
    drinkList.add("fruit juice");

    // Add the miniature list to the 2D Array list
    groceryList.add(bakeryList);
    groceryList.add(produceList);
    groceryList.add(drinkList);

    // Print the 2D list
    System.out.println("Print the 2D list");
    System.out.println(groceryList);
    System.out.println("\n\n\n");

    // Print a specific list from the 2D list
    System.out.println("Print a specific list from the 2D list");
    System.out.println(groceryList.get(1));
    System.out.println("\n\n\n");

    // Print a specific item from the selected list: 1st get selects the list, 2nd get selects the value from the list
    System.out.println("Print a specific item from the selected list");
    System.out.println(groceryList.get(1).get(2));
    

    }   
}
