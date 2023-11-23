import java.io.*;

public class CustomClassLoaderWithModification extends ClassLoader {
    public Class<?> findClass(String name) {
        try {
            byte[] classData = loadAndModifyClass(name);
            return defineClass(name, classData, 0, classData.length);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    private byte[] loadAndModifyClass(String className) throws IOException {
        String fileName = className.replace(".", File.separator) + ".class";
        try (FileInputStream fis = new FileInputStream(fileName);
             ByteArrayOutputStream bos = new ByteArrayOutputStream()) {
            int data;
            while ((data = fis.read()) != -1) {
                // Modify bytecode if needed
                bos.write(data);
            }
            return bos.toByteArray();
        }
    }

    public static void main(String[] args) throws ClassNotFoundException {
        CustomClassLoaderWithModification classLoader = new CustomClassLoaderWithModification();
        Class<?> myClass = classLoader.loadClass("com.example.MyClass");
        // Use the loaded class...
    }
}
