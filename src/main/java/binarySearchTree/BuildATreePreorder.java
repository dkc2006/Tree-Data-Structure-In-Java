package binarySearchTree;

public class BuildATreePreorder {
    public static void main(String[] args) {
        int[] nodes = new int[]{1, 2, 4, -1, -1, 5, -1, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree binaryTree = new BinaryTree();
        Node root = BinaryTree.buildTree(nodes);
        System.out.println(root.data);
    }

    static class Node {
        int data;
        Node leftNode;
        Node rightNode;

        Node(int data) {
            this.data = data;
            this.leftNode = null;
            this.rightNode = null;
        }
    }

    static class BinaryTree {
        static int index = -1;

        public static Node buildTree(int[] nodes) {
            index++;
            if (nodes[index] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[index]);
            newNode.leftNode = buildTree(nodes);
            newNode.rightNode = buildTree(nodes);
            return newNode;
        }
    }
}
