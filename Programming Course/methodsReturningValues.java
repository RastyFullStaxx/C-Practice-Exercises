public class methodsReturningValues {
    public static void main(String[] args){



        int x = 3;
        int y = 7;

        // Pass on the arguments
        int z = addNumbers(x, y);

        System.out.println(z);

    }

        // Perform the add operation
    static int addNumbers(int x,  int y){
        int z = x + y;                          // created a 3rd variable to hold the sum
        return z;                               // returns the sum to the place where the method was invoked 
                                                // and store it wherever it was assigned
    } 

}
