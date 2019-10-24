package academy.Heaps;

public class HeapSort
{

    public void sort(int[] arr)
    {
        //Recursive Algorithm to sort an Array
        int len = arr.length;
        for (int i = (len / 2) - 1; i >= 0; i--)
        {
            heapify(arr, len, i);
        }
        for(int i = len-1;i>=0;i--)
        {
            int temp=arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr,i,0);
        }

        printArray(arr);

    }

    //Heapify method implementation
    void heapify(int[] arr,int n, int i)
        {
            int largest = i;
            int leftChild = (2*i)+1;
            int rightChild = (2*i)+2;
            if (leftChild < n && arr[leftChild] > arr[largest])
            {
                largest = leftChild;
            }
            if (rightChild < n && arr[rightChild] > arr[largest])
            {
                largest = rightChild;
            }
            if(largest!=i)
            {
                int temp = arr[i];
                arr[i] = arr[largest];
                arr[largest] = temp;
                heapify(arr,n,largest);
            }
        }
        //Printing an Array
        void printArray(int[] arr)
        {
            for (int item:arr)
            {
                System.out.println(item);
            }
        }

}
