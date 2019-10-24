package academy.Heaps;

public class minHeap
{
    int capacity;
    int pos;
    int [] Heap;


    public minHeap()
    {
        //Constructor for maxHeap
        capacity = 10;
        int pos = 0;
        Heap = new int[capacity];
    }

    public void insert(int data)
    {
        //The data is stored in array and position is decrement after
        Heap[pos++] = data;
        int child = pos-1;
        int parent = child/2;

        while (Heap[parent] > Heap[child])
        {
            //Swaping of Node
            int tmp = Heap[child];
            Heap[child] = Heap[parent];
            Heap[parent] = tmp;

            child = parent;
            parent = child/2;

        }

    }
    //Printing of Sorted Array
    public void print ()
    {
        System.out.println("MinHeap");
        for(int i = 0; i <= pos; i++)
        {
            System.out.print(Heap[i]+",");
        }
    }
}
