package DS.BT;

import java.util.LinkedList;
import java.util.Queue;

public class Binary_Tree {
    static class Node{
        int data;
        Node left;
        Node right;
        Node (int data){
            this.data = data;
            left = null;
            right = null;
        }
    }
    static class Btree {
        static int idx = -1;  //variable for travel


        public  Node build(int nodes[]) {
            idx++;  //root init
            if (nodes[idx] == -1) {
                return null;
            }
            Node newnode = new Node(nodes[idx]);
            newnode.left = build(nodes);
            newnode.right = build(nodes);
            return newnode;
        }

        public void preorder(Node root){
            if (root == null){
                return;
            }
            System.out.print(root.data+"-");
            preorder(root.left);
            preorder(root.right);
        }
        public void inorder(Node root){
            if (root == null){
                return;
            }
            inorder(root.left);
            System.out.print(root.data+"-");
            inorder(root.right);
        }
        public void postorder(Node root){
            if (root == null){
                return;
            }
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data+"-");
        }
        public void level_order(Node root){
            //base case
            if (root == null){
                return;
            }
            Queue<Integer> q = new LinkedList<>();
            q.add(root.data);
            q.add(null);  // for the next line


        }
    }



    public static void main(String[] args) {

        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
       Btree tree = new Btree();
       Node root = tree.build(nodes);

        System.out.println("Root of the Tree :"+root.data);
        tree.preorder(root);

    }
}
