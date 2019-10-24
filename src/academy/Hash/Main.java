package academy.Hash;

import java.util.Hashtable;

import java.util.Hashtable;

public class Main
{
    public static void main(String[] args)
    {
        Hashtable<String, Integer> number = new Hashtable<String, Integer>();
        //insertion in the hashtable
        number.put("one",1);
        number.put("two",2);
        number.put("three",3);
        number.put("four",4);
        number.put("five",1);
        //Retrieval of value
        Integer n = number.get("two");

        if (n != null)
        {
            System.out.println("two "+n);
        }
        //Contains method
        boolean conKey=number.containsKey("four");
        System.out.println(conKey);
        //IsEmpty Method
        System.out.println(number.isEmpty());
        //Size of table
        System.out.println(number.size());
        //Replace Method
        number.replace("five",5);
        System.out.println(number.get("five"));


    }
}
