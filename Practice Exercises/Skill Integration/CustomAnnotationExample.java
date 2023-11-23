import java.lang.annotation.*;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface MyAnnotation {
    String value();
}

public class CustomAnnotationExample {
    @MyAnnotation("This is a custom annotation")
    public void myMethod() {
        // Method implementation here
    }

    public static void main(String[] args) throws NoSuchMethodException {
        Method method = CustomAnnotationExample.class.getMethod("myMethod");
        MyAnnotation annotation = method.getAnnotation(MyAnnotation.class);
        System.out.println("Annotation Value: " + annotation.value());
    }
}
