package StackProblem;

public class StackImplementation {
    int[] arr;
    int top;
    int capacity;
    StackImplementation(int size)
    {
        arr=new int[size];
        capacity = size;
        top = -1;
    }

    public void push(int data)
    {
        if(isStackFull())
        {
            System.out.println("Stack is aleardy full");
            return;
        }
        top++;
        arr[top] = data;
    }
    public boolean isStackFull()
    {
        if(top==capacity-1)
            return true;
            return false;
       // return top == capacity-1;
    }
    public int pop()
    {
        if(isEmpty())
        {
            System.out.println("Stack Empty");
        }
        int temp = arr[top];
        top--;
        return temp;
    }
    public boolean isEmpty()
    {
        if(top==-1)
            return true;
        return false;
    }
    public int size()
    {
        return top+1;
    }
    public int peek()
    {
        if(isEmpty())
        {
            return -1;
        }
        return arr[top];
    }

    //3 1 97 --> 97 1 3

    public static void main(String[] args) {
        StackImplementation stack = new StackImplementation(10);
        stack.push(3);
        stack.push(1);
        stack.push(97);

        //System.out.println(stack.pop());
        System.out.println(stack.size());
        System.out.println(stack.peek());
    }
}
