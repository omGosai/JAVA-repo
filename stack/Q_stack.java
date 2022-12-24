package DS.stack;

// Reverse String using stack
// Adding at bottom in stack

import java.util.Stack;

public class Q_stack {
    public static void main(String[] args) {
        String name ="Om Gosai";
        char a[] = name.toCharArray();

        Stack<Character> s = new Stack<Character>();

    for (char i:a){
        s.push(i);
    }

    while(!s.isEmpty()){
        System.out.print(s.peek());
        s.pop();
    }


    Stack<Integer> stack  = new Stack<>();
    stack.add(1);
    stack.add(2);
    stack.add(3);
        System.out.println("Before");
        System.out.println("\nNormal Print :"+stack);
        printstack(stack);

        stack.add(1);
        stack.add(2);
        stack.add(3);
        addbottm(007,stack);
        System.out.println("\nAfter");
        System.out.println("\nNormal Print :"+stack);
        printstack(stack);

    }
    public static void addbottm(int n,Stack<Integer>s){
        // base case
        if (s.isEmpty()){
            s.add(n);
            return;
        }
        int temp = s.pop();
        addbottm(n,s);
        s.push(temp);
    }
    public static void printstack(Stack<Integer> s){
        while(!s.isEmpty()){
            System.out.print(s.peek());
            s.pop();
        }
    }
}
