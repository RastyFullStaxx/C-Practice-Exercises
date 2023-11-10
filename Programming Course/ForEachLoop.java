import java.util.ArrayList;

public class ForEachLoop {
    public static void main(String[] args){

        // For-Each Loop    =   Traversing technique to iterate throught the elements in an array/collection
        //                      less steps, more reable
        //                      less flexible

        //String[] animals = {"cat", "dog", "bird", "rodents"};
        ArrayList<String> animals = new ArrayList<>();
        animals.add("cat");
        animals.add("dog");
        animals.add("rodents");
        animals.add("cat");

        for(String i : animals){
            System.out.println(i);
        }

    }
}
