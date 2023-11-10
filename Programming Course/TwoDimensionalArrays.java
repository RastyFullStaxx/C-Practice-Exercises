public class TwoDimensionalArrays {
    public static void main(String[] args){

        //2D Array - an array that have rows and columns

        /* 
        String[][] cars = new String[3][3];
        
        cars[0][0] = "Camero";
        cars[0][1] = "Corvette";
        cars[0][2] = "Subaru";

        cars[1][0] = "Ferrari";
        cars[1][1] = "Lamborgini";
        cars[1][2] = "Tesla";

        cars[2][0] = "Nissan";
        cars[2][1] = "Ford";
        cars[2][2] = "Honda";
        */


        String[][] cars = {
                            {"Camero", "Corvette", "Subaru"},
                            {"Ferrari", "Lamborgini", "Tesla"},
                            {"Nissan", "Ford", "Honda"}
                          }; 

        for (int i=0; i<cars.length; i++){
            System.out.println();
                for(int j=0; j<cars[i].length; j++){
                    System.out.print(cars[i][j]+ " ");
                }
        } System.out.println("\n\n\n\n");
    }


}
