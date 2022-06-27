package BatchMarch;

import java.util.Iterator;
import java.util.Stack;

public class StackJava {

    public static void main(String[] args) {
        Stack<String> stack=new Stack<String>();
        stack.push("Welcome");
        stack.push("to");
        stack.push("Newton");
        stack.push("School");

        System.out.println(stack.pop());

        System.out.println(stack);

        System.out.println(stack.size());

        System.out.println(stack.peek());

        System.out.println(stack.isEmpty());


        Iterator it=stack.iterator();

        while(it.hasNext()){
            System.out.print(it.next()+ " ");
        }

    }


}
