package Recursion;

public class countNodes {
    //static Stack<Integer> data=new Stack<>();
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int val){
            data=val;
            left=null;
            right=null;
        }
    }
    static int idx=0;
    public static int count(Node root){
        if(root!=null){
            idx++;
        }
        if(root==null){
            return 0;
        }
        count(root.left);
        count(root.right);
        return 0;
    }
    public static void main(String args[]){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right =new Node(3);
        root.left.left = new Node(5);
        root.left.right = new Node(4);
        root.right.left = new Node(7);
        root.right.right = new Node(6);
        count(root);
        System.out.println("Number of Nodes:"+idx);
    }
}
