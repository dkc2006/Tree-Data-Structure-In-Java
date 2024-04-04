package binarySearchTree;

public class BuildATree {
    int data;
    BinaryTreeNodeFindingANode leftNode;
    BinaryTreeNodeFindingANode rightNode;

    public BuildATree(int data) {
        this.data = data;
    }

}

class BinaryTree {
    BinaryTreeNodeFindingANode rootNode;

    void insertNode(int data) {
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
}

class Main {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.rootNode = new BinaryTreeNodeFindingANode(53);
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
