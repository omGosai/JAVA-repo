package DS.Collection_frame;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class ITERATOR {
    public static void main(String[] args) {

        LinkedList<Integer> numbers = new LinkedList<>();

        // Adding elm.
        int i = 1;
        while (i <= 10){
            numbers.add(i);
            i++;
        }
        System.out.println(numbers);

        String base = "-----------------------------------------";
        System.out.println(base);


        // Iterator
        Iterator iter = numbers.iterator();
        while (iter.hasNext()){
            System.out.print(iter.next()+" ");
        }
        System.out.println(base);



        // ListIterator ( backword traversal)
        ListIterator liter = numbers.listIterator(numbers.size());
        while (liter.hasPrevious()){
            System.out.print(liter.previous()+" ");
        }
        System.out.println(base);



        //For-each Method
        numbers.forEach(index -> System.out.print(index+" "));
        System.out.println(base);


        //For-each Loop
        for (int x:numbers){
            System.out.print(x+" ");
        }
        System.out.println(base);



        //Get method
        for (int x=0; x<numbers.size(); x++){
            System.out.print(numbers.get(x)+" ");
        }



    }
}
