import java.net.URL;
import java.net.URLClassLoader;

public class DynamicClassLoaderExample {
    public static void main(String[] args) throws Exception {
        URL[] urls = {new URL("file:///path/to/myjar.jar")};
        ClassLoader classLoader = new URLClassLoader(urls);

        Class<?> dynamicClass = classLoader.loadClass("com.example.MyClass");
        Object instance = dynamicClass.newInstance();

        // Use the dynamically loaded class
    }
}
