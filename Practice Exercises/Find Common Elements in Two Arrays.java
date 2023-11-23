import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class CommonElements {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {4, 5, 6, 7};
        List<Integer> commonElements = findCommonElements(array1, array2);

        System.out.println("Common elements: " + commonElements);
    }

    public static List<Integer> findCommonElements(int[] array1, int[] array2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        for (int num : array1) {
            set1.add(num);
        }
        for (int num : array2) {
            set2.add(num);
        }

        set1.retainAll(set2);

        return new ArrayList<>(set1);
    }
}
