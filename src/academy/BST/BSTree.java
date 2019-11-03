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
        else if (value < node.data)
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

    //preOrder Traversal of A binary search tree
    public void preOrderTraversal(Node root)
    {
        if(root == null)
        {
            return;
        }
        System.out.println(root.data);
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);

    }
    //inOrder Traversal of A binary search tree
    public void inOrderTraversal(Node root)
    {
        if(root == null)
        {
            return;
        }
        inOrderTraversal(root.left);
        System.out.println(root.data);
        inOrderTraversal(root.right);

    }
    //postOrder Traversal of A binary search tree
    public void postOrderTraversal(Node root)
    {
        if(root == null)
        {
            return;
        }
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.println(root.data);
    }


        // Searching a integer value in Binary tree
        public boolean search(Node node, int data )
    {   boolean isPresent = false;
        if  (node == null){
            return false;
        }
        while (node != null)
        {
            if (data < node.data)
            {
                node = node.left;
            }
            else if (data > node.data)
            {
                node = node.right;
            }
            else
            {
                isPresent = true;
                break;
            }
        }
        return isPresent;
    }

    public void delete(Node node, int data)
    {
        Node node1;
        while (node != null)
    {
        if (node == null)
        {
           // return node;
        } else if (data < node.data)
        {
            node = node.left;
        }
        else if (data > node.data)
        {
            node = node.right;
        }
        else if (data == node.data)
        {
           node1 = deleteNode(node,data);
        }

    }
        return ;
    }

    public Node deleteNode(Node node, int data)
    {
        if (node.right == null || node.left == null )
        {
     //       node.data = null;
        }
        return node;

    }


}
