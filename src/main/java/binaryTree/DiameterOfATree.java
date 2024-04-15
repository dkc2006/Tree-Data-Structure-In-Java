package binaryTree;

import static binaryTree.DiameterOfATree.Information.diameter;

public class DiameterOfATree {
    public static int height(Node root) {
        if (root == null) {
            return 0;
        }
        int leftHalf = height(root.leftNode);
        int rightHalf = height(root.rightNode);
        return Math.max(leftHalf, rightHalf) + 1;
    }

    //Approach 1 It has O(N^2) time Complexity;
    public static int diameter2(Node root) {
        if (root == null) {
            return 0;
        }
        int leftDiameter = diameter2(root.leftNode);
        int leftHeight = height(root.leftNode);
        int rightDiameter = diameter2(root.rightNode);
        int rightHeight = height(root.rightNode);

        int selfDiameter = leftHeight + rightHeight + 1;
        return Math.max(selfDiameter,Math.max(leftDiameter, rightDiameter));
    }

    //Approach 2 It has O(N) time Complexity;
    static class Information{
        int diameter;
        int height;
        public Information(int diameter, int height) {
            this.diameter = diameter;
            this.height = height;
        }
        public static Information diameter(Node root){
            if(root == null){
                return new Information(0,0);
            }
            Information leftInformation = diameter(root.leftNode);
            Information rightInformation = diameter(root.rightNode);

            int diameter = Math.max(Math.max(leftInformation.diameter,rightInformation.diameter),leftInformation.height+rightInformation.height+1);
            int height = Math.max(leftInformation.height,rightInformation.height);

            return new Information(diameter,height);
        }
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
        System.out.println(diameter(root).diameter);

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
