package DS.Linked_list;

import java.util.ArrayList;
import java.util.LinkedList;

public class Palindrome_LL {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        list.add(1);
        list.add(2);
        list.add(2);
        list.add(1);


        ArrayList<Integer> alist = new ArrayList<>(list.size());
        alist.addAll(list);

        for (int i=0; i<alist.size(); i++){
            if (alist.get(i) != alist.get(alist.size()-1-i)){
                System.out.println("Not Palindrome..");
                return;
            }else {
                System.out.println("Palindrome..");
                return;
            }
        }
    }
}
