package DS.Linked_list;

// addfirst(),addlast(),add() - add in middle,
// deletefist(),deletelast(),print(),size()

public class Linkedlist {
    Node head;
    private int size;
    Linkedlist(){size = 0;}
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
            size++;
        }
    }
        public void addfirst (int newdata){
            Node newnode = new Node(newdata);
            newnode.next = head;     //pointing newnode to old head
            head = newnode;         // newnode becomes new head
        }
        public void addlast(int newdata){
            Node newnode  = new Node(newdata);
            if (head == null){
                head = newnode;
                return;
            }
            Node temp = head;
            while (temp.next != null){
                temp = temp.next;
            }
            temp.next = newnode;
        }


        // add with index value
        public void add(int newdata,int idx){
        // for adding at head
            if (idx == 0){
                addfirst(newdata);
                return;
            }
            Node newnode = new Node(newdata);
            Node temp = head;
            int i = 0;
            while (i < idx-1){
                temp = temp.next;
                i++;
            }
            i = idx-1;
            newnode.next = temp.next;
            temp.next = newnode;
        }

        public int search(int key){
        if (head == null){
            return -1;
        }
        Node temp = head;
        int i =0;
        while (temp!=null){
            if (key == temp.data){
                return i;
            }
            temp = temp.next;
            i++;
            }
        return -1;
        }

        public void deletefirst(){
        // corner case
            if (head == null){
                System.out.println("Linked list is already null");
                return;
            }
            head = head.next;       //changing head value
            size --;
        }
        public void deletelast (){
        if (head == null){
            System.out.println("Linked list is already");
            return;
        }
        size--;
            Node temp = head;
            Node tprw = null;
            while (temp.next != null){
                tprw = temp;
                temp = temp.next;
            }
            tprw.next = null;
        }

        //REVERSE LINKED LIST
        public void reverse(){
        // in case linked is empty or only have one elm.
        if (head == null || head.next == null){
            return;
        }
        Node prw = head;
        Node mid = head.next;
        Node next;
        while (mid != null){
            next = mid.next;
            mid.next = prw;

            prw = mid;
            mid =next;
        }
        head.next = null;
        head =prw;
        }
        public void print(){
        if (head == null){
            System.out.println("Linked list is empty");
            return;
        }
            Node temp = head;
            while (temp != null){
                System.out.print(temp.data+"-");
                temp = temp.next;
            }
            System.out.print(">Null");
        }
        public int getSize(){return size;}


        public static void main(String[] args) {
        Linkedlist list = new Linkedlist();
            list.addfirst(1);
            list.addfirst(2);
            list.addfirst(3);
            list.addfirst(4);

            list.addlast(00);

            //add in middle
            list.add(7,3);

            //delete
            list.deletefirst();
            list.print();

            System.out.println();
            System.out.println("Size of list :"+list.getSize());

            //search
            int key = 7;
            int ans = list.search(key);
            if (ans == -1){
                System.out.println("Not found "+key+" in list");
            }else {
                System.out.println("Found at :"+ans);
            }

            //revrses linked list
            System.out.println("Reverse list");
            list.reverse();
            list.print();
    }
}
