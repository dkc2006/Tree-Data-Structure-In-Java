package binaryTree;

public class HeightOfATree {
    public static int sum(Node root) {
        if (root == null) {
            return 0;
        }
        int leftHalfSum = sum(root.leftNode);
        int rightHalfSum = sum(root.rightNode);
        int treeSum = leftHalfSum+rightHalfSum +root.data;
        return treeSum;
    }

    public static void main(String[] args) {

        /*
             1
            /  \
           2    3
          / \  / \
         4   5 6  7

        */

        Node root = new Node(1);
        root.leftNode = new Node(2);
        root.rightNode = new Node(3);
        root.leftNode.leftNode = new Node(4);
        root.leftNode.rightNode = new Node(5);
        root.rightNode.leftNode = new Node(6);
        root.rightNode.rightNode = new Node(7);
        System.out.println("The sum of the tree is : " + sum(root));
    }

    static class Node {
        int data;
        Node leftNode;
        Node rightNode;

        public Node(int data) {
            this.data = data;
            this.leftNode = null;
            this.rightNode = null;
        }
    }
}
