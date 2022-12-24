package DS.Collection_frame;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class collection {
    public static void main(String[] args) {


        /* 1. List
                - Arraylist
                - Linkedlist
                - Vector
                    - Stack
          2. Set
               - Hashset
                   - LinkedHash set
               - Sortedset
                   - Tree set
               */

        // 1. Type safe (Creating with Generic)

        ArrayList<Integer> rank = new ArrayList<>();
        rank.add(111);
        rank.add(222);
        rank.add(333);
        rank.add(444);
        rank.add(555);

        System.out.println(rank);

        String base = "-----------------------------------------";
        System.out.println(base);


        // 2. Untype (Without Generic)

        ArrayList info = new ArrayList();
        info.add("Om gosai");
        info.add(76);
        info.add(78.79);
        info.add(true);

        System.out.println(info);
        System.out.println(base);



        // Traversing using Iterator

        // Forward Traversal
        Iterator<Integer> iter = rank.iterator();

        while (iter.hasNext()){
            System.out.print(" "+iter.next());
        }
        System.out.println("\n"+base);


        // Backward Traversal
        // ListIterator

        ListIterator Liter =  info.listIterator(info.size());
        while (Liter.hasPrevious()){
            System.out.print(Liter.previous()+" ");
        }





    }
}
