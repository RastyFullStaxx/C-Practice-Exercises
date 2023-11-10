public class StringMethods {
    public static void main(String[] args){

        // String - is a reference data type that can store one or more characters
        //          reference data types have access to useful methods

        String name = "Rasty";

        // .equal compares the strings (case sensitive), in which IgnoreCase can be used
        //boolean result = name.equals("Rasty");
        //boolean result = name.equalsIgnoreCase("rasty");             
        
        // .length measures the number of chars
        //int result = name.length();    

        // .charA tgets the char from the string using the index
        //char result = name.charAt(0)

        // .indexOf gets the index of a char from the string
        //int result = name.indexOf("R");

        // .isEmpty checks if the string is empty: return true if empty
        //boolean result = name.isEmpty();
        
        // .toUpperCase/LowerCase changes the cases of the string: toUpperCase, toLowerCase
        //String result = name.toUpperCase();

        // .trim trims the empty spaces from the string
        //String result = name.trim();

        // .replace replace a char from the string: old, new
        String result = name.replace('s', 'z');

        //substring

        System.out.println(result);

    } 
}
