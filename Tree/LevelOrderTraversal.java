package Tree;
import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {
    public static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static void levelorder(Node root){
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()){
            Node newNode = q.poll();
            System.out.print(newNode.data+" ");
            if(newNode.left!=null){
                q.add(newNode.left);
            }
            if(newNode.right!=null){
                q.add(newNode.right);
            }
        }
    }
    public static void main(String[] args){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        levelorder(root);

    }
}