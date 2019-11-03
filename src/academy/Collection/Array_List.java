package academy.Collection;

import java.util.ArrayList;
import java.util.Scanner;

public class Array_List
{
    static Scanner reader = new Scanner(System.in);
    static ArrayList<Integer> arr = new ArrayList<Integer>();

    public static void main(String[] args) {
        System.out.println("Please enter an array of Numbers, enter 0 if you want to end");
        int in = reader.nextInt();
        while (in != 0)
        {
            arr.add(in);
            in = reader.nextInt();
        }
            printArr();
            System.out.println("What are number you want to delete ?");
            int del = reader.nextInt();
            for (int i = 0;i<arr.size();i++)
            {
                if (arr.get(i) == del)
                {
                    arr.remove(i);
                    break;
                }
            }
            printArr();

        }
        public static void printArr() {
            for (int a : arr) {
                System.out.print(a + " ");
            }
        }

    }


