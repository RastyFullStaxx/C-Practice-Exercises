import ObjectsForBroCourse.hero;

public class superKeywords {
    public static void main(String[] args) {
        
        // super keyword = keyword refers to the superclass (parent) of an object
        //                 very similar to 'this.'' keyword

        hero hero1 = new hero("Batman", 42, "$$$");
        System.out.println(hero1.toString());

        hero hero2 = new hero("Superman", 43, "everything");
        System.out.println(hero2.toString());  

    }

}
