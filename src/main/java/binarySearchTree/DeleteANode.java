package binarySearchTree;

public class DeleteANode {
    int data;
    DeleteANode leftNode;
    DeleteANode rightNode;

    public DeleteANode(int data) {
        this.data = data;
    }

}

class BinaryTree3 {
    DeleteANode rootNode;

    public static void main(String[] args) {
        BinaryTree3 binaryTree = new BinaryTree3(); // Corrected instantiation
        binaryTree.rootNode = new DeleteANode(53); // Using DeleteANode instead of BinaryTreeNodeFindingANode
        DeleteANode thirty = new DeleteANode(30);
        DeleteANode seventyTwo = new DeleteANode(72);
        DeleteANode fourteen = new DeleteANode(14);
        DeleteANode thirtyNine = new DeleteANode(39);
        DeleteANode sixtyOne = new DeleteANode(61);
        DeleteANode eightyFour = new DeleteANode(84);
        DeleteANode seventyNine = new DeleteANode(79);
        DeleteANode nine = new DeleteANode(9);
        DeleteANode twentyThree = new DeleteANode(23); // Changed variable name to follow Java naming conventions
        DeleteANode thirtyFour = new DeleteANode(34);
        DeleteANode fortySeven = new DeleteANode(47);

        // Building the binary search tree
        binaryTree.rootNode.leftNode = thirty;
        binaryTree.rootNode.rightNode = seventyTwo;
        thirty.leftNode = fourteen;
        thirty.rightNode = thirtyNine;
        seventyTwo.leftNode = sixtyOne;
        seventyTwo.rightNode = eightyFour;
        fourteen.leftNode = nine;
        fourteen.rightNode = twentyThree;
        thirtyNine.leftNode = thirtyFour;
        thirtyNine.rightNode = fortySeven;
        eightyFour.leftNode = seventyNine;

        boolean deleted = binaryTree.delete(23);
        System.out.println("Node with key 23 deleted: " + deleted);
    }

    void insertNode(int data) {
        DeleteANode node = new DeleteANode(data);
        if (rootNode == null) {
            rootNode = node;
        } else {
            DeleteANode currentNode = rootNode;
            DeleteANode parentNode;
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

    public boolean delete(int key) {
        DeleteANode currentNode = rootNode;
        DeleteANode parent = null;
        boolean isLeftChild = true;

        // Find the node to delete and its parent
        while (currentNode != null && currentNode.data != key) {
            parent = currentNode;
            if (key < currentNode.data) {
                isLeftChild = true;
                currentNode = currentNode.leftNode;
            } else {
                isLeftChild = false;
                currentNode = currentNode.rightNode;
            }
        }

        // If node not found
        return currentNode != null;
    }

}

