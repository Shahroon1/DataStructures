package academy.linkedlist;

public class LinkedList {
    Node head;
    //Insertion at last position
    public void insertAtLast(int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;

        if (head == null) {
            head = node;
        }
        else
            {
            Node n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = node;

        }
    }
    //InsertionAt Start position
    public void insertAtStart(int data){
        Node node = new Node();
        node.data = data;
        node.next = null;
        node.next = head;
        head = node;
    }
    //Insertion At Specified Location
    public void insertAt(int index, int data)
    {
        if (index == 0)
        {
            insertAtStart(data);
        }
        else
            {
        Node node = new Node();
        node.data = data;
        node.next = null;
        Node n = head;
        for(int i=0; i < index-1 ; i++ )
        {
            n = n.next;
        }
        node.next = n.next;
        n.next = node;

            }
    }
    //Deletion At Specified index
    public void delete(int index)
    {
        Node n = head;
        Node n1 = null;
        for (int i = 0; i < index-1;i++)
        {
            n = n.next;
        }
        n1 = n.next;
        n.next = n1.next;


        }

        public void show()
                //Printing the LinkedList
        {
            Node node = head;
            while(node.next!=null){
                System.out.println(node.data);
                node = node.next;
            }
            System.out.println(node.data);
        }

}
