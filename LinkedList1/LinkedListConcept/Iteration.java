package LinkedList1.LinkedListConcept;

public class Iteration {
    public static void main(String[] args) {

        Node<Integer> Node1 = new Node<Integer>(10);
        Node<Integer> Node2 = new Node<Integer>(20);
        Node<Integer> Node3 = new Node<Integer>(30);
        
        Node1.next = Node2;
        Node2.next = Node3;

        Node<Integer> Head = Node1;

        while(Head != null) {

                System.out.println(Head.data);
                Head = Head.next;
        }
            
        
}
}
