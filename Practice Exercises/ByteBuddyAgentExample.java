import net.bytebuddy.ByteBuddy;
import net.bytebuddy.agent.ByteBuddyAgent;
import net.bytebuddy.implementation.FixedValue;
import net.bytebuddy.matcher.ElementMatchers;

public class ByteBuddyAgentExample {
    public static void main(String[] args) {
        ByteBuddyAgent.install();

        new ByteBuddy()
            .subclass(Object.class)
            .method(ElementMatchers.named("toString"))
            .intercept(FixedValue.value("Hello, Byte Buddy!"))
            .make()
            .load(ByteBuddyAgentExample.class.getClassLoader())
            .getLoaded();

        Object instance = new Object();
        System.out.println(instance.toString()); // Outputs "Hello, Byte Buddy!"
    }
}
