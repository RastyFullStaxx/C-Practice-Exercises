package ObjectsForBroCourse;

public class Friend {

    public String name;
    public static int numberOfFriends;

    public Friend(String name){
        this.name = name;
        numberOfFriends++;
    }

    public static void displayFriendnumbers(){
        System.out.println("You have " + numberOfFriends + " friends within this string!");
    }

    public void displayFriends() {
        System.out.println(name);
    }

}
