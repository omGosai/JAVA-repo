package DS;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class collection_in {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(0,11);
        ll.add(22);ll.add(33);ll.add(4);ll.add(5);

        System.out.println(ll);
        System.out.println();
        for(int i:ll){
            System.out.println(i);
        }

        System.out.println("Printing with itor");
        Iterator it = ll.iterator();
        int s= ll.size();
        while (it.hasNext()){
            System.out.println(it.next());
        }


        System.out.println("Printing with Get vlaues..");
        for (int i=0; i<ll.size(); i++){
            System.out.print(" "+ll.get(i));
        }

        System.out.println();
        System.out.println("Collection.sort");
        Collections.sort(ll);
        System.out.println(ll);
    }


}
