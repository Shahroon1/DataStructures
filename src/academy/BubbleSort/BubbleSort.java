package academy.BubbleSort;

public class BubbleSort
{
    public static void main(String[] args)
    {
        //Array declaration and initializing
        int[] arr = {23,65,45,234,54,23,767,4,2};
        bSort(arr);
    }


    public static void bSort(int[] arr)
    {
        int temp;
        //Traversing with adjacent elements
        for (int i = arr.length - 1; i>0; i--)
        {
            for (int j = 0; j< i; j++)
            {
                if (arr[j] > arr[j+1])
                {
                    //Actual Swaping
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        //Printing out the results
        System.out.print("Sorted Array:");
        for(int i = 0; i < arr.length; i++)
        {
            System.out.println(arr[i]+", ");
        }

    }
}

