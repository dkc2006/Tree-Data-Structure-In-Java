package binarySearchTree;

public class BinaryTreeNodeFindingANode {
    int data;
    BinaryTreeNodeFindingANode leftNode;
    BinaryTreeNodeFindingANode rightNode;

    public BinaryTreeNodeFindingANode(int data) {
        this.data = data;
    }
}

class BinaryTree1 {
    BinaryTreeNodeFindingANode rootNode;

    public void insertNode(int data) {
        BinaryTreeNodeFindingANode node = new BinaryTreeNodeFindingANode(data);
        if (rootNode == null) {
            rootNode = node;
        } else {
            BinaryTreeNodeFindingANode currentNode = rootNode;
            BinaryTreeNodeFindingANode parentNode;
            while (true) {
                parentNode = currentNode;
                if (data < currentNode.data) {
                    currentNode = currentNode.leftNode;
                    if (currentNode == null) {
                        parentNode.leftNode = node;
                        return;
                    }
                } else {
                    currentNode = currentNode.rightNode;
                    if (currentNode == null) {
                        parentNode.rightNode = node;
                        return;
                    }
                }
            }
        }
    }

    public BinaryTreeNodeFindingANode find(int key) {
        BinaryTreeNodeFindingANode currentNode = rootNode;
        while (currentNode.data != key) {
            if (key < currentNode.data) currentNode = currentNode.leftNode;
            else currentNode = currentNode.rightNode;
            if (currentNode == null) return null;
        }
        return currentNode;
    }
}


class Main1 {
    public static void main(String[] args) {
        BinaryTree1 binaryTree1 = new BinaryTree1();
        binaryTree1.insertNode(53);
        BinaryTreeNodeFindingANode thirty = new BinaryTreeNodeFindingANode(30);
        BinaryTreeNodeFindingANode seventyTwo = new BinaryTreeNodeFindingANode(72);
        BinaryTreeNodeFindingANode fourteen = new BinaryTreeNodeFindingANode(14);
        BinaryTreeNodeFindingANode thirtyNine = new BinaryTreeNodeFindingANode(39);
        BinaryTreeNodeFindingANode sixtyOne = new BinaryTreeNodeFindingANode(61);
        BinaryTreeNodeFindingANode eightyFour = new BinaryTreeNodeFindingANode(84);
        BinaryTreeNodeFindingANode seventyNine = new BinaryTreeNodeFindingANode(79);
        BinaryTreeNodeFindingANode nine = new BinaryTreeNodeFindingANode(9);
        BinaryTreeNodeFindingANode TwentyThree = new BinaryTreeNodeFindingANode(23);
        BinaryTreeNodeFindingANode thirtyFour = new BinaryTreeNodeFindingANode(34);
        BinaryTreeNodeFindingANode fourtySeven = new BinaryTreeNodeFindingANode(47);
        binaryTree1.rootNode = new BinaryTreeNodeFindingANode(53); // Initialize rootNode
        binaryTree1.rootNode.leftNode = thirty; // Initialize leftNode of rootNode
        binaryTree1.rootNode.rightNode = seventyTwo; // Initialize rightNode of rootNode
        thirty.leftNode = fourteen;
        thirty.rightNode = thirtyNine;
        seventyTwo.leftNode = sixtyOne;
        seventyTwo.rightNode = eightyFour;
        fourteen.leftNode = nine;
        fourteen.rightNode = TwentyThree;
        thirtyNine.leftNode = thirtyFour;
        thirtyNine.rightNode = fourtySeven;
        eightyFour.leftNode = seventyNine;
        BinaryTreeNodeFindingANode findResult = binaryTree1.find(23);
        if (findResult.data == Integer.MIN_VALUE) {
            System.out.println("Node with key not found.");
        } else {
            System.out.println("Node found with key: " + findResult.data);
        }
    }
}
