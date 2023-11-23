import java.lang.ref.*;

public class PhantomReferenceExample {
    public static void main(String[] args) {
        Object object = new Object();
        ReferenceQueue<Object> referenceQueue = new ReferenceQueue<>();
        PhantomReference<Object> phantomReference = new PhantomReference<>(object, referenceQueue);

        object = null; // Release the strong reference

        // Explicitly invoke garbage collection
        System.gc();

        try {
            Reference<?> reference = referenceQueue.remove();
            if (reference instanceof PhantomReference) {
                System.out.println("Phantom reference collected");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
