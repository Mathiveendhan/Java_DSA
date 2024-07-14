package Tree;

import java.util.*;
public class isLeftRightTreeIdentical {
    static Queue<Integer> q=new LinkedList<>();
    static Queue<Integer> q1=new LinkedList<>();
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
        public static void check1(Node root){
          if(root!=null){
              q.add(root.data);
          }
          else{
               return;
          }
          check1(root.left);
          check1(root.right);
        }
        static int count=0;
        static int count1=0;
    public static void check2(Node root){
        if(root!=null){
            count++;
            q1.add(root.data);
        }
        else{
            return;
        }
        check2(root.left);
        check2(root.right);
    }

    public static void main(String args[]){
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(2);
        root.left.left=new Node(3);
        root.left.right=new Node(4);
        root.right.left=new Node(3);
        root.right.right=new Node(4);
        check1(root.left);
        check2(root.right);
        while(!q.isEmpty() && !q1.isEmpty()){
            if(q.peek()==q1.peek()){
                count1++;
            }
            q.poll();
            q1.poll();
        }
        if(count==count1){
            System.out.println("Identical");
        }
        else{
            System.out.println("not Identical");
        }
    }

}
