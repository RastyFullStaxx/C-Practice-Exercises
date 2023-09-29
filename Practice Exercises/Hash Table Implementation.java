import java.util.HashMap;
import java.util.Map;

public class HashTableExample {
    public static void main(String[] args) {
        Map<String, Integer> hashTable = new HashMap<>();
        hashTable.put("Alice", 25);
        hashTable.put("Bob", 30);
        hashTable.put("Charlie", 22);

        System.out.println("Age of Bob: " + hashTable.get("Bob"));
    }
}
