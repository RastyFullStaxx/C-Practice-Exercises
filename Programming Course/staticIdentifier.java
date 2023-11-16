import ObjectsForBroCourse.Friend;
public class staticIdentifier {
    
    /*      static
     *      > a modifier
     *      > A single copy of a variable/method is created and shared.
     *      > the class 'owns' the static member                        */
     
    public static void main(String[] args) {
        
        Friend friend1 = new Friend("Spongebob");
        Friend friend2 = new Friend("Patrick");
        Friend friend3 = new Friend("Squidward");
        Friend friend4 = new Friend("Sandy");


        Friend.displayFriendnumbers();

        Friend[] friends = {friend1, friend2, friend3, friend4};

        for (Friend friend : friends) {
            System.out.println("Friend Name: " + friend.name);
        }

    }
}
