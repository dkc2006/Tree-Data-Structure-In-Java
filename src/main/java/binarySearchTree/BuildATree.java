package binarySearchTree;

public class BuildATree {
    int data;
    FindingANode leftNode;
    FindingANode rightNode;

    public BuildATree(int data) {
        this.data = data;
        this.leftNode = null;
        this.rightNode = null;
    }

}

class BinaryTree {
    FindingANode rootNode;

    void insertNode(int data) {
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
}

class Main {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.rootNode = new FindingANode(53);
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
        binaryTree.rootNode.leftNode = thirty;
        binaryTree.rootNode.rightNode = seventyTwo;
        thirty.leftNode = fourteen;
        thirty.rightNode = thirtyNine;
        seventyTwo.leftNode = sixtyOne;
        seventyTwo.rightNode = eightyFour;
        fourteen.leftNode = nine;
        fourteen.rightNode = TwentyThree;
        thirtyNine.leftNode = thirtyFour;
        thirtyNine.rightNode = fourtySeven;
        eightyFour.leftNode = seventyNine;
    }
}