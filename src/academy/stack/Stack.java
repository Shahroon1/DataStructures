package academy.stack;

public class Stack
{

    int stack[] = new int[5];
    int top = 0;

    public void push(int data)
    {
        if (top == 5)
        {
            System.out.println("Stack is Full");
        }
        else
            {
                stack[top] = data;
                top++;
            }
    }
    public void show()
    {
        for(int i = top-1; i>= 0; i--)
        {
            System.out.println(stack[i]);
        }
    }
    public void pop()
    {
        top--;
        int data = stack[top];
        System.out.println("poped "+data);
        stack[top] = 0;
    }
    public void peek()
    {
        System.out.println("Peek is "+ stack[top-1]);

    }
    public boolean isEmpty()
    {
        return top <= 0;
    }
}
