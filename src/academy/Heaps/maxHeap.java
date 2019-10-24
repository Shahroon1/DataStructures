package academy.Heaps;

public class maxHeap {
    private int[] Heap;
    private int capacity;
    private int pos;
    //Constructor for maxHeap
    maxHeap() {
        capacity = 10;
        pos = 0;
        Heap = new int[capacity];

    }


    public void insert(int data)
    {
        if (pos == capacity)
        {
            int [] Heap1 = new int [capacity*2];
            System.arraycopy(Heap,0,Heap1,0,capacity);
            Heap = Heap1;
        }
            //The data is stored in array and position is increment after
            Heap[pos++] = data;
            //Declaring parent and child
            int child = pos - 1;
            int parent = child / 2;
            //Swaping parent and child && reswaping
            while (Heap[parent] < Heap[child])
            {
                //Swaping of Node
                int tmp = Heap[child];
                Heap[child] = Heap[parent];
                Heap[parent] = tmp;
                 child  = parent;
                 parent = child/2;

            }

    }

    public int[] print()
    //Printing of Sorted Array
    {
        System.out.println("maxheap");
        for (int i = 0; i <= pos; i++) {
            System.out.print(Heap[i] + ",");
        }
        System.out.println();
        return Heap;

    }
}