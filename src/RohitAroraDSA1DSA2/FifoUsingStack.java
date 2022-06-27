package BatchMarch;

import java.util.Stack;

public class FifoUsingStack {

    static Stack<Integer> s1=new Stack<>();
    static Stack<Integer> s2=new Stack<>();
//6 25 5 4

    // s1 -> 6 25 5 4
    // s2 ->

    public static void push(int n){
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }

        s1.push(n);

        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
    }

    public static int pop(){
        if(s1.isEmpty()){
            System.out.println("No elements");
            return -1;
        }
       return s1.pop();
    }


    public static void main(String[] args) {
        FifoUsingStack fifo=new FifoUsingStack();
        fifo.push(4);
        fifo.push(5);
        fifo.push(25);

        System.out.println(fifo.pop());//4
        System.out.println(fifo.pop());//5
    }
}
