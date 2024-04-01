package tree;

public class BinarySearchTree {
    int data;
    BinarySearchTree leftNode;
    BinarySearchTree rightNode;

    public BinarySearchTree(int data) {
        this.data = data;
    }

}

class BinaryTree {
    BinarySearchTree rootNode;

    void insertNode(int data) {
        BinarySearchTree node = new BinarySearchTree(data);
        if (rootNode == null) {
            rootNode = node;
        } else {
            BinarySearchTree currentNode = rootNode;
            BinarySearchTree parentNode;
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
        binaryTree.rootNode = new BinarySearchTree(53);
        BinarySearchTree thirty = new BinarySearchTree(30);
        BinarySearchTree seventyTwo = new BinarySearchTree(72);
        BinarySearchTree fourteen = new BinarySearchTree(14);
        BinarySearchTree thirtyNine = new BinarySearchTree(39);
        BinarySearchTree sixtyOne = new BinarySearchTree(61);
        BinarySearchTree eightyFour = new BinarySearchTree(84);
        BinarySearchTree seventyNine = new BinarySearchTree(79);
        BinarySearchTree nine = new BinarySearchTree(9);
        BinarySearchTree TwentyThree = new BinarySearchTree(23);
        BinarySearchTree thirtyFour = new BinarySearchTree(34);
        BinarySearchTree fourtySeven = new BinarySearchTree(47);
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