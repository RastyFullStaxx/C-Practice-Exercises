import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.*;

@Aspect
@Configuration
public class AspectExample {

    @Pointcut("execution(* com.example.MyService.*(..))")
    public void serviceMethods() {}

    @Before("serviceMethods()")
    public void beforeServiceMethod(JoinPoint joinPoint) {
        System.out.println("Before executing: " + joinPoint.getSignature());
    }

    @After("serviceMethods()")
    public void afterServiceMethod(JoinPoint joinPoint) {
        System.out.println("After executing: " + joinPoint.getSignature());
    }

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AspectExample.class);
        MyService service = context.getBean(MyService.class);
        service.doSomething();
        context.close();
    }
}

class MyService {
    public void doSomething() {
        System.out.println("Service method called.");
    }
}
