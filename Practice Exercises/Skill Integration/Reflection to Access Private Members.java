import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionExample {
    public static void main(String[] args) throws Exception {
        MyClass obj = new MyClass();
        Class<?> clazz = obj.getClass();

        // Access private field
        Field privateField = clazz.getDeclaredField("privateField");
        privateField.setAccessible(true);
        int fieldValue = (int) privateField.get(obj);
        System.out.println("Private Field Value: " + fieldValue);

        // Access private method
        Method privateMethod = clazz.getDeclaredMethod("privateMethod");
        privateMethod.setAccessible(true);
        privateMethod.invoke(obj);
    }
}

class MyClass {
    private int privateField = 42;

    private void privateMethod() {
        System.out.println("Private Method");
    }
}
