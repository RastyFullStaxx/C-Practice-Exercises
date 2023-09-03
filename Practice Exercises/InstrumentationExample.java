import java.lang.instrument.ClassFileTransformer;
import java.lang.instrument.Instrumentation;

public class InstrumentationExample {
    public static void premain(String agentArgs, Instrumentation inst) {
        ClassFileTransformer transformer = (loader, className, classBeingRedefined, protectionDomain, classfileBuffer) -> {
            // Transform bytecode here
            return classfileBuffer;
        };

        inst.addTransformer(transformer);
    }
}
