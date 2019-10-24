package academy.stack;

public class DStack
{
    //Dynamic Stack Declarartion
    int capacity = 2;
    int stack[] = new int[capacity];
    int top = 0;

    public void push(int data)

        {
            if (size() == capacity)
            {
                expand();
            }
            stack[top] = data;
            top++;
        }
        //Creating a new Stack with increased capacity
    private void expand()
    {
        int lenght = size();
        int[] stack1 = new int[2*capacity];
        System.arraycopy(stack,0,stack1,0,lenght);
        stack = stack1;
        capacity *= 2;
    }
    //printing the stack
    public void show()
    {

        for(int n : stack)
        {
            System.out.println(n + " ");
        }
    }
    //POP method implementation
    public void pop()
    {
        top--;
        int data = stack[top];
        System.out.println("poped "+data);
        stack[top] = 0;
        shrink();
    }
    //Shrink method implementation
    private void shrink() {
        if (size() == (capacity / 2)/2)
        {
            int length = size();
            int[] stack1 = new int[capacity / 2];
            System.arraycopy(stack, 0, stack1,0, length);
            stack = stack1;
            capacity = capacity/2;
        }
    }
    //Peek gives the most recent element in the stack
    public void peek()
    {
        System.out.println("Peek is "+ stack[top-1]);

    }

    //isEmpty returns true if it is empty
    public boolean isEmpty()
    {
        return top <= 0;
    }
    //return true
    public int size()
    {
        return top;
    }
}
