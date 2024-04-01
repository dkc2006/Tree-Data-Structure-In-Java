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
        }
        else{
            BinarySearchTree currentNode = rootNode;
            BinarySearchTree parentNode;
        }


    }
}
