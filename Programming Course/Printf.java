public class Printf {
    public static void main(String[] args){

        // printf   =   an optional method to control, format and display text to console window
        //              two arguments = format string + (objective  /   variable/   value)
        //              % [flags] [precision] [width] [conversion-character]
        //              

        
        boolean myBoolean = true;               // %b
        char myChar = '@';                      // %c
        String myString = "Rasty";              // %s
        int myInt = 18;                         // %d
        double myDouble = 29.99;                // %f
        double myDouble2 = 29.99;
        double myDouble3 = -29.99;
        double myDouble4 = 100000.99;

        //[conversion-character]
        System.out.printf("%b\n", myBoolean);
        System.out.printf("%c\n", myChar);
        System.out.printf("%s\n", myString);
        System.out.printf("%d\n", myInt);
        System.out.printf("%.2f\n", myDouble);

        //[width]
        //sets the minimum number of characters to be written as output
        System.out.printf("\n\n\nHello %10s", myString);

        //[precision]
        //sets number of digits of precision when outputting floating-point values
        System.out.printf("\n\n\nYou have this money %.2f", myDouble);

        //[flags]
        //adds an effect to output based on the flag added to format specifier
        /*
         *  - : left-justify
         *  + : output a plus (+) or minus (-) sign for a numeric value
         *  0 : numeric values are zero-padded
         *  , : comma grouping separator if numbers  >  1000
         */

        //  [-]
        System.out.printf("\n\n\nYou have this money %20f", myDouble);
        System.out.printf("\nYou have this money %-20f", myDouble);

        // [+]
        System.out.printf("\n\nYou have this money %+f", myDouble2);
        System.out.printf("\nYou have this money %+f", myDouble3);

        // [0]
        System.out.printf("\n\nYou have this money %020f", myDouble);

        // [0]
        System.out.printf("\n\nYou have this money %,20f", myDouble4);
        


    }
}
