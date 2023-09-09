import java.util.ServiceLoader;

public interface MyService {
    void doSomething();
}

public class ServiceLoaderExample {
    public static void main(String[] args) {
        ServiceLoader<MyService> loader = ServiceLoader.load(MyService.class);
        for (MyService service : loader) {
            service.doSomething();
        }
    }
}

// Service Provider Implementation (in a different class or JAR)
public class MyServiceImpl implements MyService {
    public void doSomething() {
        System.out.println("Service Implementation: Doing something");
    }
}
