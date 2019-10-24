package academy.stack;

public class Main
{
    public static void main(String[] args)
    {
            Stack stack = new Stack();
            System.out.println("Is Empty = " + stack.isEmpty());
            stack.push(5);
            stack.push(10);
            stack.push(15);
            stack.push(20);
            stack.push(70);
            stack.push(66);
            stack.show();
            stack.pop();
            stack.pop();
            stack.peek();
            stack.show();
            System.out.println("Is Empty = " + stack.isEmpty());


            DStack dstack = new DStack();
            dstack.push(8);
            dstack.push(18);
            dstack.push(3);
            dstack.push(89);
            dstack.pop();
            dstack.pop();
            dstack.pop();
            dstack.show();


    }
}
