import java.util.Comparator;

public class BubbleSortWithComparator {
    public static void main(String[] args) {
        Person[] people = {
                new Person("Alice", 25),
                new Person("Bob", 20),
                new Person("Charlie", 30),
                new Person("David", 22)
        };

        System.out.println("Original Array: " + Arrays.toString(people));
        bubbleSortWithComparator(people, Comparator.comparing(Person::getAge));
        System.out.println("Sorted Array by Age: " + Arrays.toString(people));
    }

    public static void bubbleSortWithComparator(Object[] arr, Comparator<Object> comparator) {
        // Implement the Bubble Sort algorithm using a comparator for sorting custom objects
    }
}

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Implement getters and toString method
}
