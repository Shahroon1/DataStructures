package academy.BST;

//Introduction to Binary search tree

public class BSTree
{

//Insertion of Node to tree
    public Node insert(Node node, int value) {
//If the node is not present
        if (node == null) {
            return createNode(value);
        }
        //Insertion at Left
        if (value < node.data)
        {
            node.left = insert(node.left,value);
        }
        //insertion at Right
        else if (value > node.data)
        {
         node.right = insert(node.right, value);
        }
         return node;


    }
//Creating a Node
    public Node createNode(int data) {
        Node node1 = new Node();
        node1.left = null;
        node1.data = data;
        node1.right = null;
        return node1;

    }
}
