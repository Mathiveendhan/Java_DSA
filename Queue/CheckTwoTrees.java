package Queue;
import java.util.*;

public class CheckTwoTrees {
    static Queue<Integer> rootQu=new LinkedList<>();
    static Queue<Integer> rootQu1=new LinkedList<>();

    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int val) {
            data = val;
            left = null;
            right = null;
        }
    }

        public static void LoadQ(Node root) {
            if (root != null) {
                rootQu.add(root.data);
            }
            if (root == null) {
                return;
            }
            LoadQ(root.left);
            LoadQ(root.right);

        }

        public static void LoadQ1(Node root) {
            if (root != null) {
                rootQu1.add(root.data);
            }
            if (root == null) {
                return;
            }
            LoadQ1(root.left);
            LoadQ1(root.right);

        }

        static int count = 0;
        static int len=0;
        public static int check(Queue rootQu, Queue rootQu1) {
           while(!rootQu.isEmpty() && !rootQu1.isEmpty()){
               len++;
               if(rootQu.peek()==rootQu1.peek()){
                   count++;
               }
               rootQu.poll();
               rootQu1.poll();
           }
            return count;
        }
        public static void main(String args[]) {
            Node root = new Node(1);
            root.left = new Node(2);
            root.right = new Node(3);
            root.left.left = new Node(5);
            root.left.right = new Node(4);
            root.right.left = new Node(7);
            root.right.right = new Node(8);

            Node root1 = new Node(1);
            root1.left = new Node(2);
            root1.right = new Node(3);
            root1.left.left = new Node(5);
            root1.left.right = new Node(6);  //element not same here
            root1.right.left = new Node(7);
            root1.right.right = new Node(8);
            LoadQ(root);
            LoadQ1(root1);
            int ans=check(rootQu,rootQu1);
            if(ans==len){
                System.out.println("Elements are same");
            }
            else{
                System.out.println("Elements not are same");
            }
        }
    }

