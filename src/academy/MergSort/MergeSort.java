package academy.MergSort;

public class MergeSort
{
    int[] array;
    int[] tempMergeArr;
    int length;
    public static void main(String[] args)
    {
        int[] inputArr = {58,93,57,3,49,5};
        MergeSort ms = new MergeSort();
        ms.sort(inputArr);

        for (int i :inputArr)
        {
         System.out.println(i + " ");
        }
    }
    public void sort(int inputArr[])
    {
        this.array = inputArr;
        this.length = inputArr.length;
        this.tempMergeArr = new int[length];
        divideArray(0,length-1);

    }

    public void divideArray(int lindex, int hindex)
    {
        if (lindex<hindex)
        {
            int middle = lindex + (hindex -lindex)/2;
            //left sort
            divideArray(lindex,middle);
            //right sort
            divideArray(middle+1,hindex);
            mergeArray(lindex,middle,hindex);

        }
    }
    public void mergeArray(int lindex, int middle, int hindex)
    {
        for(int i = lindex; i<= hindex; i++ )
        {
            tempMergeArr[i] = array[i];
        }

        int i = lindex;
        int j = middle+1;
        int k = lindex;
        while(i<=middle && j<=hindex)
        {
            if(tempMergeArr[i] <= tempMergeArr[j])
            {
                array[k]=tempMergeArr[i];
                i++;

            }
            else
                {
                    array[k]=tempMergeArr[j];
                    j++;
                }
            k++;
        }
        while(i<=middle)
        {
            array[k] = tempMergeArr[i];
            k++;
            i++;

        }
    }

}
