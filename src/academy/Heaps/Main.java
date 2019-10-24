package academy.Heaps;

public class Main
{
    public static void main(String[] args)
    {
        maxHeap heap = new maxHeap();

        //Insertion in maxHeap
        heap.insert(20);
        heap.insert(10);
        heap.insert(40);
        heap.insert(30);
        heap.insert(80);
        heap.insert(23);
        heap.insert(34);
        heap.insert(42);
        heap.insert(4);
        heap.insert(24);
        heap.insert(76);
        heap.insert(675);
        heap.insert(31);
        heap.insert(94);
        int[]Heap = heap.print();
//insertion Minheap
        minHeap minheap = new minHeap();
        minheap.insert(20);
        minheap.insert(10);
        minheap.insert(40);
        minheap.insert(30);
        minheap.insert(80);
        minheap.insert(23);
        minheap.insert(34);
        minheap.insert(42);
        minheap.insert(4);
        //minheap.insert(24);
     /*   minheap.insert(76);
        minheap.insert(675);
        minheap.insert(31);
        minheap.insert(94);*/
        minheap.print();
//Heapsort in Array implementation
        HeapSort S = new HeapSort();
        int[] arr = Heap;
        S.sort(arr);

    }
}
