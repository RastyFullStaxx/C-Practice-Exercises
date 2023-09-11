// Enable Elastic Metaspace in JVM options
// -XX:+UseElasticMetaspace

public class ElasticMetaspaceExample {
    public static void main(String[] args) {
        for (int i = 0; i < 1000000; i++) {
            // Create and load classes dynamically
            ClassLoader classLoader = new MyClassLoader();
            try {
                Class<?> dynamicClass = classLoader.loadClass("com.example.DynamicClass" + i);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    }
}

class MyClassLoader extends ClassLoader {
    // Custom class loader for dynamic class loading
}
