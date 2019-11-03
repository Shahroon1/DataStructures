package academy.Collection;
import java.util.Comparator;
import java.util.TreeSet;
public class Tree_Set
{
    public static void main(String[] args)
    {
        TreeSet t = new TreeSet(new myComparator());

        t.add(12);
        t.add(103);
        t.add(102);
        t.add(14);
        t.add(23);
        t.add(1);
        t.add(176);
        t.add(165);
        t.add(15);
        t.add(17);
        System.out.println(t);



    }
}
class myComparator implements Comparator
{

    public int compare(Object o1, Object o2)
    {
        Integer i1 = (Integer)o1;
        Integer i2 = (Integer)o2;
        //Sorting order changed to descending using compareTo method changing the object placement
        //return i2.compareTo(i1);


        //Only first element will be entered, All other elements will be considered as duplicates
        // return 0;


        //Reversing the insertion order return 0 to keep it as it is
        //return -1;


        // defining the default Comparator
        if(i1>i2){
            return -1;

        }
        else if (i1<i2)
        {
            return 1;

        }
        else {
            return 0;
        }

    }
}