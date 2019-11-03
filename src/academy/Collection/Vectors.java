package academy.Collection;

import java.awt.desktop.SystemEventListener;
import java.util.Enumeration;
import java.util.Vector;

public class Vectors
{
    public static void main(String[] args)
    {
        Vector v = new Vector(10,5);
        System.out.println(v.capacity());
        for (int i = 0; i<= 10; i++)
        {
            v.addElement(i);
        }
            System.out.println(v.capacity());
            v.addElement("A");
            System.out.println(v.capacity());
            System.out.println(v);

        Enumeration e = v.elements();
        while(e.hasMoreElements())
        {
            Integer I = (Integer)e.nextElement();
            System.out.println(I);
        }

    }
}
