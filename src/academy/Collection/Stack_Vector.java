package academy.Collection;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Stack;

public class Stack_Vector
{
    public static void main(String[] args)
    {
        Stack s = new Stack();
        for(int i = 0; i<= 10; i++)
        {
            s.push(i);
        }
        s.pop();
        s.pop();
        // search Method gives offset of index of element from the peek.
        int indexOf = s.search("Offeset from Peek of object 7" + 7);
       System.out.println(indexOf);
       System.out.println(s);

        Iterator itr = s.iterator();
        while(itr.hasNext())
        {
            Integer I = (Integer)itr.next();
            System.out.print(I);
        }



    }
}
