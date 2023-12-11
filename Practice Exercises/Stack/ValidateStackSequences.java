import java.util.Stack;

public class ValidateStackSequences {
    public static void main(String[] args) {
        int[] pushed = {1, 2, 3, 4, 5};
        int[] popped1 = {4, 5, 3, 2, 1};
        int[] popped2 = {4, 3, 5, 1, 2};

        System.out.println("Is the first sequence valid? " + validateStackSequences(pushed, popped1));
        System.out.println("Is the second sequence valid? " + validateStackSequences(pushed, popped2));
    }

    public static boolean validateStackSequences(int[] pushed, int[] popped) {
        // Implement a function to check if the popped sequence is valid for the given pushed sequence
        return false;
    }
}
