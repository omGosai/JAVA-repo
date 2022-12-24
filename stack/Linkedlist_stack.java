package DS.stack;

public class Linkedlist_stack {
    Node head = null;
    class Node {
        int data;
        Node next;
        Node(int data){
            this.data=data;
            next = null;
        }

        public boolean isempty(){
            return head == null;
        }

        public void push(int data){
            Node newnode = new Node(data);
            if (isempty()){
                head = newnode;
            }
            newnode.next = head;
            head = newnode;
        }

        public int pop (){
            if (isempty()){
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }

        public int peek(){
            if (isempty()){
                return -1;
            }
            int top = head.data;
            return top;
        }
    }
    public static void main(String[] args) {
        Arraylist_stack stack = new Arraylist_stack();

        stack.push(54);
        stack.push(90);
        stack.push(69);
        stack.push(73);
        stack.push(3);

        while (!stack.isempty()){
            System.out.print(stack.peek()+" ");
            stack.pop();
        }
    }
}
