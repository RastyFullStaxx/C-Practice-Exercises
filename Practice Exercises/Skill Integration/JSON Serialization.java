import com.fasterxml.jackson.databind.ObjectMapper;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class JsonSerializationExample {
    public static void main(String[] args) throws Exception {
        Person person = new Person("Alice", 30);
        ObjectMapper objectMapper = new ObjectMapper();
        String json = objectMapper.writeValueAsString(person);
        System.out.println("JSON: " + json);
    }
}
