package ObjectsForBroCourse;

public class Human {
    
    public String name;
    public int age;
    public double weight;

    public Human(String name, int age, double weight){
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public void eat(){
        System.out.println(this.name+ " is eating..");
    }

    public void drink(){
        System.out.println(this.name+" is drinking");
    }

}
