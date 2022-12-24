package DS.stack;

import java.util.ArrayList;

// Stack using arraylist
public class Arraylist_stack {

    ArrayList <Integer> list = new ArrayList<>();

    //checking for null stack
    public Boolean isempty(){
        return list.size() == 0;
    }

    public void push (int data){
        list.add(data);
    }

    public int pop (){
        if (isempty()){
            return -1;
        }
        int temp = list.get(list.size()-1);  //we have to return the elm.
        list.remove(list.size()-1);
        return temp;
    }

    public int peek (){
        if (isempty()){
            return -1;
        }
        int temp = list.get(list.size()-1);
        return temp;
    }
    public static void main(String[] args) {
        Arraylist_stack stack = new Arraylist_stack();

        stack.push(23);
        stack.push(54);
        stack.push(76);
        stack.push(73);
        stack.push(3);

        while (!stack.isempty()){
            System.out.print(stack.peek()+" ");
            stack.pop();
        }
    }
}
