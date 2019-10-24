package academy.queue;

public class Queue
{
    //Queue Declalaration
    int[] queue = new int[5];
    int front;
    int rear;
    int size;
    //Constructor
    public void enQueue(int data)
        {
            queue[rear%5] = data;
            rear++;
            size += 1;
        }
    //dequeue method implementation
     public int deQueue()
     {
         int data = queue[front%5];
         //queue[front] = 0;
         front += 1;
         size = size-1;
         return data;

     }
     //Show method Implementation
    public void show()
    {
        for (int i = 0; i < size; i++)
        {
            System.out.print(queue[(front + i)%5]);
        }
    }
    //isEmpty Method implementation

    public boolean isEmpty()
    {
        return size == 0;
    }
    //isFull Method implementation
    public boolean isFull()
    {
        return size == 5;
    }
}
