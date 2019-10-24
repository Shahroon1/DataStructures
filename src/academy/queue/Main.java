package academy.queue;

public class Main
{
    public static void main(String[] args)
    {
     Queue q = new Queue();
     System.out.println("Is empty = " + q.isEmpty());
     //enQueue in the Data Structure
     q.enQueue(5);
     q.enQueue(8);
     q.enQueue(5);
     q.enQueue(8);
     q.enQueue(5);
     q.enQueue(8);
     //deQueue in the Data Structure
     System.out.println("deQueue "+ q.deQueue());
     System.out.println("deQueue "+ q.deQueue());
     System.out.println("deQueue "+ q.deQueue());
     System.out.println("deQueue "+ q.deQueue());
    //isEmpty in the Queue
     System.out.println("Is empty = " + q.isEmpty());
    //isfull In Queue
     System.out.println("Is Full = " + q.isFull());

    //Printing theQueue
     q.show();
    }
}
