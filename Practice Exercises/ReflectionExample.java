public class ReflectionExample {
    public static void main(String[] args) throws Exception {
        Class<?> cls = Class.forName("com.example.MyClass");
        Object obj = cls.getDeclaredConstructor().newInstance();
        // Use the object
    }
}
