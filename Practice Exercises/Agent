import java.lang.instrument.*;
import java.lang.management.ManagementFactory;

public class Agent {
    public static void premain(String agentArgs, Instrumentation inst) {
        System.out.println("Agent is running");
        inst.addTransformer(new MyClassFileTransformer());
    }
}

class MyClassFileTransformer implements ClassFileTransformer {
    public byte[] transform(ClassLoader loader, String className, Class<?> classBeingRedefined, ProtectionDomain protectionDomain, byte[] classfileBuffer) {
        System.out.println("Transforming class: " + className);
        return classfileBuffer;
    }
}

public class ProfilingExample {
    public static void main(String[] args) {
        System.out.println("Main method");
        // Your application logic here
    }
}
