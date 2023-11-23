// Enable Z Garbage Collector in JVM options
// -XX:+UseZGC

public class ZGarbageCollectorExample {
    public static void main(String[] args) {
        for (int i = 0; i < 1000000; i++) {
            // Allocate and release memory
            byte[] data = new byte[1024];
        }
    }
}
