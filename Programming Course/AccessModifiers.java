import ObjectsForBroCourse.AccessMClass;

    /* Access Modifier Types
     *      
     *      default     =     a class/method/variable with no modifier is easily understood to be accessible only to class within the package
     *      public      =     a class/method/variable is available to all classes even outside the package
     *      protected   =     a class/method/variable is only available to its sublass (the subclass must instantiate itself)
     *      private     =     a class/method/variable is only available to the class itself
     *  
     */

public class AccessModifiers extends AccessMClass{
    
    private String privateMessage = "This is the private message";
        public static void main(String[] args) {
        
        // Public
        AccessMClass c = new AccessMClass();
        System.out.println(c.publicMessage);

        // Protected
        AccessModifiers aSub = new AccessModifiers();           // must instantiate itself
        System.out.println(aSub.protectedMessage);

        // Private
        System.out.println(aSub.privateMessage);

    }
}
