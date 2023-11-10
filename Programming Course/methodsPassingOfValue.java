public class methodsPassingOfValue {
    public static void main(String[] args){

        //  Passing a value to an argument
        //
        //  1.  matching value/variable should be inside the parenthesis of the function in and out
        //      of the main function
        
        //  Arguments   =   values/variables set in the method inside the main function to be passed on
        //  Parameters   =   values/variables set in the method outside the main function to act as placeholders
        //  !!! the name in the parameter doesnt need be the same with the argument passed

        String name = "Rasty";
        printHello(name);                                       // Pass in the varaible    

    }

    static void printHello(String name) {                       // Declare the type and enter the same variable
        System.out.println("Hello master " + name + "!");
    }

}
