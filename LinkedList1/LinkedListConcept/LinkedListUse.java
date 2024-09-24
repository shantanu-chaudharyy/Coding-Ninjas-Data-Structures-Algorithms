package LinkedList1.LinkedListConcept;

public class LinkedListUse {
    public static void main(String[] args) {
        Node<Integer> Node1 = new Node<Integer>(10);

        System.out.println(Node1.data);
        System.out.println(Node1.next);  // Will print "null" as no next node is linked
    
        System.out.println();

        Node<Integer> Node2 = new Node<Integer> (20);
        Node1.next = Node2;
       
        System.out.println(Node2);
        System.out.println(Node1.next);  // prints 10
        
    }
}