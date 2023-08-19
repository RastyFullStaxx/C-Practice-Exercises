import java.lang.reflect.Method;

class MyClass {
    public void printMessage(String message) {
        System.out.println("Message: " + message);
    }
}

public class Reflection {
    private static Object newInstance;

    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        Class<?> cls = MyClass.class;
        final Object obj = newInstance;

        Method method = cls.getDeclaredMethod("printMessage", String.class);
        method.invoke(obj, "Hello, Reflection!");
    }
}