package binarySearchTree;

public class BuildATree {
    int data;
    BuildATree leftNode;
    BuildATree rightNode;

    public BuildATree(int data) {
        this.data = data;
    }

}

class BinaryTree {
    BuildATree rootNode;

    void insertNode(int data) {
        BuildATree node = new BuildATree(data);
        if (rootNode == null) {
            rootNode = node;
        } else {
            BuildATree currentNode = rootNode;
            BuildATree parentNode;
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
        binaryTree.rootNode = new BuildATree(53);
        BuildATree thirty = new BuildATree(30);
        BuildATree seventyTwo = new BuildATree(72);
        BuildATree fourteen = new BuildATree(14);
        BuildATree thirtyNine = new BuildATree(39);
        BuildATree sixtyOne = new BuildATree(61);
        BuildATree eightyFour = new BuildATree(84);
        BuildATree seventyNine = new BuildATree(79);
        BuildATree nine = new BuildATree(9);
        BuildATree TwentyThree = new BuildATree(23);
        BuildATree thirtyFour = new BuildATree(34);
        BuildATree fourtySeven = new BuildATree(47);
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
