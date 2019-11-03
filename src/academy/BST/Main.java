package academy.BST;

public class Main
{
public static void main(String[] args)
    {
        Node root = null;
        BSTree n = new BSTree();

        root = n.insert(root,9);
        root = n.insert(root,10);
        root = n.insert(root,11);
        root = n.insert(root,12);
        root = n.insert(root,4);

        System.out.println("inOrderTraversal");
        n.inOrderTraversal(root);
        System.out.println("preOrderTraversal");
        n.preOrderTraversal(root);
        System.out.println("postOrderTraversal");
        n.postOrderTraversal(root);

        boolean result = n.search(root,15);
        System.out.println(result);

      // Node node2 = n.delete(root,12);


    }
}
