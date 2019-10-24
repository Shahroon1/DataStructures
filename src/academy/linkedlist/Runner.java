package academy.linkedlist;

public class Runner {
    public static void main(String[] args){
        LinkedList list = new LinkedList();
        list.insertAtLast(5);
        list.insertAtLast(10);
        list.insertAtStart(3);
        list.insertAtStart(4);
        list.insertAt(2,6);
        list.delete(3);

        list.show();


    }
}
