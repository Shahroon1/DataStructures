package academy.QuickSort;

public class QuickSort
{
    public static void main(String[] args)
    {
        int[] arr= {4,53,2,14,5,3,866,4,33,32,42,45};
        QuickSort qs = new QuickSort();
        int start = 0;
        int end = arr.length-1;
        qs.Sort(arr,start,end);

        for (int item:arr
             ) {System.out.println(item);

        }

    }

    public void Sort(int[] arr, int start, int end)
    {
        if(start >= end)
        {
            return;
        }
        int partitionIndex = Partition(arr,start,end);
                Sort(arr,start,partitionIndex-1);
                Sort(arr,partitionIndex+1,end);

    }

    public int Partition(int[] arr,int start,int end)
    {
        int pivot = arr[end];
        int pIndex = start;
        if(start < end) {

        for (int i = start; i < end; i++)
        {
            if (arr[i] < pivot)
            {
                swap(i,pIndex,arr);
                pIndex++;
            }
        }
        swap(pIndex,end,arr);




    }
        return pIndex;
    }
    public static void swap(int i, int j, int[] arr)
    {
     int temp = arr[i];
     arr[i] = arr[j];
     arr[j] = temp;
    }



}
