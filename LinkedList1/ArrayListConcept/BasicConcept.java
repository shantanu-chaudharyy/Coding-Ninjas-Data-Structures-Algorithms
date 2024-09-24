package LinkedList1.ArrayListConcept;

import java.util.ArrayList;

public class BasicConcept {
    
    public static void main(String[] args) {
        
        ArrayList<Integer> List1 = new ArrayList<>();

        List1.add(1);
        List1.add(2);
        List1.add(3);
        List1.add(4);
        List1.add(5);

        List1.add(0, List1.get(4));

        // System.out.println(List1.get(2));
        System.out.println(List1.size());

// List1.remove(5);
List1.set(0, 1);

        for(int i = 0; i<List1.size(); i++) {
            System.out.print(List1.get(i) + " ");
        }
        System.out.println();
        for(int elem : List1) {

            System.out.print(List1.get(elem) + " ");
        }

    }
}
