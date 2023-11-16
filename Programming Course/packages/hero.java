package ObjectsForBroCourse;

public class hero extends person2{
    
    public String power;

    public hero(String name, int age, String power) {
        super(name, age);
        this.power = power;
    }

    public String toString() {
        return super.toString() + this.power;
    } 

}
