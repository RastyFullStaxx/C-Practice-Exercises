public class methodsPassingOfValue2 {
    public static void main(String[] args){

        String name = "Rasty";
        int age = 20;
        printHello(name, age);                                       
    }

    static void printHello(String name, int age) {                       
        System.out.println("Hello master " + name + "!");
        System.out.println("You are " + age + " years old.");
    }

}
