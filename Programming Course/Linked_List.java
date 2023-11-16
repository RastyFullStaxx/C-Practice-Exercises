import java.util.LinkedList;

public class Linked_List {
    public static void main(String[] args) {
        
        LinkedList<String> myLinkedList = new LinkedList<String>();   

        // .push adds an element to the list (stack)
        /* 
        myLinkedList.push("A");
        myLinkedList.push("B");
        myLinkedList.push("C");
        myLinkedList.push("D");
        myLinkedList.push("F");
        // myLinkedList.pop();                                      // .pop removes the first (element) in the stack        
        */

        // .offer adds element to the list (queue)
        /* 
        myLinkedList.offer("A");
        myLinkedList.offer("B");
        myLinkedList.offer("C");
        myLinkedList.offer("D");
        myLinkedList.offer("F");
        myLinkedList.poll();                                        // .poll removes the first (element) in the queue   
        */

        myLinkedList.offer("A");
        myLinkedList.offer("B");
        myLinkedList.offer("C");
        myLinkedList.offer("D");
        myLinkedList.offer("F");

        /* 

        myLinkedList.add(4, "E");                     // .add inserts an element in the list  :  (index, elementvalue)
        myLinkedList.remove("E");                                 // .remove removes the specified element

        System.out.println(myLinkedList.indexOf("F"));            // .indexOf finds the index of the specified element

        System.out.println(myLinkedList.peekFirst());               // .peekFirst finds the first element in the first node
        System.out.println(myLinkedList.peekLast());                // .peekLast finds the last element in the last node
         
        myLinkedList.addFirst("0");                               // .addFirst inserts an element to the first node
        myLinkedList.addLast("G");                                // .addLast inserts an element to the last node

        String first = myLinkedList.removeFirst();
        String last = myLinkedList.removeLast();

        */

        System.out.println(myLinkedList);

    }
}
