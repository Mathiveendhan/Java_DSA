package LeetCode_problem;

import java.util.*;
public class LC1302 {
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
    public static int check(Node head){
        Queue<Node> q=new LinkedList<>();
        q.add(head);
        int sum=0;
        while(!q.isEmpty()){
           int size=q.size();
           sum=0;
           for(int i=0;i<size;i++){
               Node currentNode=q.poll();
               sum+=currentNode.data;
               if(currentNode.left!=null){
                   q.add(currentNode.left);
               }
               if(currentNode.right!=null){
                   q.add(currentNode.right);
               }
           }
        }
        return sum;
    }
    public static void main(String[] args){
        Node head=new Node(1);
        head.left=new Node(2);
        head.right=new Node(3);
        head.left.left=new Node(4);
        head.left.right=new Node(5);
        head.right.right=new Node(6);
        head.left.left.left=new Node(7);
        head.right.right.right=new Node(8);
        int ans=check(head);
        System.out.println(ans);


    }
}
