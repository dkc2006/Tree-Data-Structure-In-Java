package binarySearchTree;

public class FindingANode {
    int data;
    FindingANode leftNode;
    FindingANode rightNode;

    public FindingANode(int data) {
        this.data = data;
    }
}

class BinaryTree1 {
    FindingANode rootNode;

    public void insertNode(int data) {
        FindingANode node = new FindingANode(data);
        if (rootNode == null) {
            rootNode = node;
        } else {
            FindingANode currentNode = rootNode;
            FindingANode parentNode;
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

    public FindingANode find(int key) {
        FindingANode currentNode = rootNode;
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
        FindingANode thirty = new FindingANode(30);
        FindingANode seventyTwo = new FindingANode(72);
        FindingANode fourteen = new FindingANode(14);
        FindingANode thirtyNine = new FindingANode(39);
        FindingANode sixtyOne = new FindingANode(61);
        FindingANode eightyFour = new FindingANode(84);
        FindingANode seventyNine = new FindingANode(79);
        FindingANode nine = new FindingANode(9);
        FindingANode TwentyThree = new FindingANode(23);
        FindingANode thirtyFour = new FindingANode(34);
        FindingANode fourtySeven = new FindingANode(47);
        binaryTree1.rootNode = new FindingANode(53); // Initialize rootNode
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
        FindingANode findResult = binaryTree1.find(23);
        if (findResult != null) {
            System.out.println("Node found with key: " + findResult.data);
        } else {
            System.out.println("Node with key not found.");
        }
    }
}
