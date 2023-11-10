public class OverloadedMethods {
    public static void main(String[] args){
        
        // Overloaded methods   -   methods that share the name but have different parameters 
        //                          method name + parameters = method signature  

        double x = add(1.0, 2.0, 3.0, 4.0);
        System.out.println(x);

    }

    static int add(int a, int b) {
        System.out.println("This is overloaded method A");
        return a + b;
    }

    static int add(int a, int b, int c) {
        System.out.println("This is overloaded method B");
        return a + b + c;
    }

    static int add(int a, int b, int c, int d) {
        System.out.println("This is overloaded method C");
        return a + b + c + d;
    }

    static double add(double  a, double b) {
        System.out.println("This is overloaded method special A");
        return a + b;
    }

    static double add(double a, double b, double c) {
        System.out.println("This is overloaded method special B");
        return a + b + c;
    }

    static double add(double a, double b, double c, double d) {
        System.out.println("This is overloaded method special C");
        return a + b + c + d;
    }


}