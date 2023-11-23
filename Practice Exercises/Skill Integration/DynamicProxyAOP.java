import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

interface Calculator {
    int add(int a, int b);
}

class CalculatorImpl implements Calculator {
    public int add(int a, int b) {
        return a + b;
    }
}

class LoggingHandler implements InvocationHandler {
    private Object target;

    public LoggingHandler(Object target) {
        this.target = target;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Entering method: " + method.getName());
        Object result = method.invoke(target, args);
        System.out.println("Exiting method: " + method.getName());
        return result;
    }
}

public class DynamicProxyAOP {
    public static void main(String[] args) {
        Calculator calculator = new CalculatorImpl();
        Calculator proxyCalculator = (Calculator) Proxy.newProxyInstance(
                Calculator.class.getClassLoader(),
                new Class[]{Calculator.class},
                new LoggingHandler(calculator));
        int sum = proxyCalculator.add(5, 7);
        System.out.println("Sum: " + sum);
    }
}
