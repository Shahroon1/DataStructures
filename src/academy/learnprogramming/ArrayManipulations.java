package academy.learnprogramming;

import java.util.Arrays;

public class ArrayManipulations {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        char[] copyFrom = {'a','b','e','f','g','c','d'};
        char[] copyTo = Arrays.copyOfRange(copyFrom,2,5);
        int search = Arrays.binarySearch(arr,5);
        Arrays.parallelSort(copyFrom);
        System.out.println(copyTo);
        System.out.println(search);
        System.out.println(copyFrom);

    }
}
