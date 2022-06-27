package BatchMarch;

public class StackImplementation {

    int[] arr; // using which we will implement stack
    int top;  //  index of top element , arr[top]
    int capacity;

    StackImplementation(int size){
        arr=new int[size];
        capacity=size;
        top=-1; // showing that stack is empty
    }

    public void push(int data){

        if(isStackFull()){
            System.out.println("Stack is already full, no insertion can be done");
            return;
        }

        System.out.println("Lets push the element in stack");
        top++;
        arr[top]=data;
    }

    public boolean isStackFull(){
        if(top==capacity-1)
            return true;
        return false;
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public int pop(){

        if(isEmpty()){
            System.out.println("Stack is empty nothing to pop");
            return -1;
        }

        System.out.println("Lets remove the element from stack");
        int topElement=arr[top];
        top--;// actual pop
        return topElement;
    }

    public int size(){
        return top+1;
    }


    public int peek(){
        if(isEmpty()){
            System.out.println("Stack is empty nothing to pop");
            return -1;
        }
        return arr[top];
    }



    public void printStack(){
        for(int i=top;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }

    //3 1 97 5 4

    //4 5 97 1 3
    public static void main(String[] args) {
        StackImplementation stack=new StackImplementation(10);
        stack.push(3);
        stack.push(1);
        stack.push(97);

//        System.out.println(stack.pop());
//        System.out.println(stack.pop());

        System.out.println(stack.size());

        System.out.println(stack.peek());

        stack.printStack();
    }
}
