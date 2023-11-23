import java.util.*;

public class HashMapSortingByValue {
    public static void main(String[] args) {
        Map<String, Integer> unsortedMap = new HashMap<>();
        unsortedMap.put("Alice", 85);
        unsortedMap.put("Bob", 92);
        unsortedMap.put("Charlie", 78);

        Map<String, Integer> sortedMap = sortByValue(unsortedMap);

        System.out.println("Sorted HashMap by Value:");
        for (Map.Entry<String, Integer> entry : sortedMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static Map<String, Integer> sortByValue(Map<String, Integer> map) {
        List<Map.Entry<String, Integer>> list = new LinkedList<>(map.entrySet());

        list.sort((o1, o2) -> (o1.getValue()).compareTo(o2.getValue()));

        Map<String, Integer> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        return sortedMap;
    }
}
