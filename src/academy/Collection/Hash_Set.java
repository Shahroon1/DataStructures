package academy.Collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
//Underlying DataStructure is Hashtable;
//Hashset can take heterogenous objects

public class Hash_Set
{
    public static void main(String[] args) {
        HashSet h = new HashSet();
        h.add(8);
        h.add(9);
        h.add(5);
        h.add("Hero");
        h.add(2);
        h.add("Rock");
        h.add(null);
        System.out.println(h.add("Hero"));
        System.out.println(h);

        LinkedHashSet lh = new LinkedHashSet();
        lh.add(8);
        lh.add(9);
        lh.add(5);
        lh.add("Hero");
        lh.add(2);
        lh.add("Rock");
        lh.add(null);
        System.out.println(lh.add("Hero"));
        System.out.println(lh);



    }
}
