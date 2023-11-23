public record Person(String name, int age) {
    // Implicitly generated constructor, accessor methods, equals, hashCode, and toString
}

public class RecordExample {
    public static void main(String[] args) {
        Person person = new Person("Alice", 30);
        System.out.println(person.name()); // Accessor method
        System.out.println(person.age());

        // Records provide a concise way to define immutable data classes
    }
}
