import java.util.Stack;

public class OnlineStockSpan {
    public static void main(String[] args) {
        StockSpanner spanner = new StockSpanner();
        System.out.println(spanner.next(100));
        System.out.println(spanner.next(80));
        System.out.println(spanner.next(60));
        System.out.println(spanner.next(70));
        System.out.println(spanner.next(60));
        System.out.println(spanner.next(75));
        System.out.println(spanner.next(85));
    }
}

class StockSpanner {
    Stack<int[]> stack = new Stack<>();

    public int next(int price) {
        // Implement a function to calculate the stock span for an online stock span problem
        return 0;
    }
}
