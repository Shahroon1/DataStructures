package academy.Map;

import java.util.*;

public class Hash_Map
{
    public static void main(String[] args)
    {
        HashMap m = new HashMap();
        m.put("David",3400);
        m.put("Raven",2800);
        m.put("Feroz",4500);
        m.put("Trevor",3600);

        System.out.println(m);

        //put method returns the previous value contained for the that key.
        System.out.println(m.put("Feroz",4800));

        //Set of Keys
        Set s = m.keySet();
        System.out.println(s);

        //Collection of values
        Collection c = m.values();
        System.out.println(c);

        //Set of entries in a Map
        Set s1 = m.entrySet();
        System.out.println(s1);

        //iterator for entrySet();

        Iterator itr = s1.iterator();
        while(itr.hasNext())
        {
          //  System.out.println(itr.next());
            Map.Entry m1 = (Map.Entry)itr.next();

            // Changing the value of an entry using the key.
            if (m1.getKey().equals("Trevor"))
            {
                m1.setValue(3800);
            }
            System.out.println(m1.getKey() + " " + m1.getValue());


        }


    }
}
