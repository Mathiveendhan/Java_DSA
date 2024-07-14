package Tree;

public class BinaryTreeConditionCheck {
    class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public Node check(int[] nodes, int start, int end) {
        if (start > end) {
            return null;
        }
        if (start == end) {
            return new Node(nodes[start]);
        }

        int mid = (end + start) / 2;
        Node root = new Node(nodes[mid]);
        root.left = check(nodes, start, mid - 1);
        root.right = check(nodes, mid + 1, end);
        return root;
    }

    public static void main(String[] args) {
        int[] nodes = {10, 20, 30, 40, 50, 60, 70};
        BinaryTreeConditionCheck tree = new BinaryTreeConditionCheck();
        Node root = tree.check(nodes, 0, nodes.length - 1);
        int middle=nodes[3];
        if
        (root.data==middle) {
            System.out.println(root.data);
            System.out.println("it is BinaryTree");
        } else {
            System.out.println("Tree is empty");
        }
    }
}