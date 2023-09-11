import java.util.concurrent.Flow.*;

public class FlowAPIExample {
    public static void main(String[] args) {
        SubmissionPublisher<Integer> publisher = new SubmissionPublisher<>();
        Subscriber<Integer> subscriber = new MySubscriber();
        publisher.subscribe(subscriber);

        publisher.submit(1);
        publisher.submit(2);
        publisher.submit(3);
        publisher.close();
    }

    static class MySubscriber implements Subscriber<Integer> {
        public void onSubscribe(Subscription subscription) {
            subscription.request(Long.MAX_VALUE);
        }

        public void onNext(Integer item) {
            System.out.println("Received: " + item);
        }

        public void onError(Throwable throwable) {
            System.err.println("Error: " + throwable);
        }

        public void onComplete() {
            System.out.println("Done!");
        }
    }
}
