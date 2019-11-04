package academy.SelectionSort;

import static com.sun.tools.javac.jvm.ByteCodes.swap;

public class SelectionSort {
    public static void main(String[] args)
    {


    int[] arr = {4,2,7,56,3,4,87,44,23,21};
    int len = arr.length;
    for (int i =0; i <len; i++)
    {
        int jmin = i;
        for (int j = i+1; j<len;j++ ) {
            if (arr[jmin] > arr[j]) {
                jmin = j;
            }
        }
            if (jmin != i)
            {
                int temp = arr[jmin];
                arr[jmin] = arr[i];
                arr[i] = temp;
            }

    }
        for (int a :arr) {
            System.out.println(a);

        }

    }

}



