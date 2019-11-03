package academy.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Linked_List
{
    public static LinkedList l = new LinkedList();
    public static Scanner reader = new Scanner(System.in);
    public static void main(String[] args)
        {

            System.out.println("Enter the number you want to add in linkedlist");

            for(int i = 0 ; i <= 10;i++)
            {
                int number = reader.nextInt();
                l.add(number);
            }
            l.remove(2);
            l.add(null);
            printLinkedList();

            //Stack methods of LinkedListthat implement architecture of Stack
            l.addLast(3);
            l.addLast(4);
            l.addLast(7);
            l.removeLast();
            l.removeLast();

            printLinkedList();



    }
    public static void printLinkedList()
    {
        Iterator itr = l.iterator();
        while(itr.hasNext())
        {
            Integer I = (Integer)itr.next();
            System.out.println(I);
        }

    }

}


