package LeetCode_problem;

import java.util.*;
public class LC513Tree {
    static Queue<Node> q=new LinkedList<>();
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int value){
            data=value;
            left=null;
            right=null;
        }
    }
    static int left=0;
        public static void check(Node root){
        q.add(root);
        while(!q.isEmpty()){
            root=q.peek();
            if(root.left!=null){
                left=root.left.data;
                q.add(root.left);
            }
            if(root.right!=null){
                q.add(root.right);
            }
            if(root==null){
                return;
            }
            q.poll();
          }
        }

    public static void main(String[] args){
       Node root=new Node(1);
       root.left=new Node(2);
       root.right=new Node(3);
       root.left.left=new Node(4);
       root.right.left=new Node(5);
        root.right.right=new Node(6);
        root.right.left.left=new Node(7);
        root.right.right.right=new Node(8);
        root.right.right.right.right=new Node(9);
        check(root);
        System.out.println(left);


    }
}
