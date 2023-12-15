public class CustomObjectBubbleSortDescending {
    public static void main(String[] args) {
        Person[] people = {
                new Person("Alice", 25),
                new Person("Bob", 20),
                new Person("Charlie", 30),
                new Person("David", 22)
        };

        System.out.println("Original Array: " + Arrays.toString(people));
        bubbleSortCustomObjectsDescending(people);
        System.out.println("Sorted Array by Age in Descending Order: " + Arrays.toString(people));
    }

    public static void bubbleSortCustomObjectsDescending(Person[] arr) {
        // Implement the Bubble Sort algorithm with custom objects in descending order
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
