import java.util.Stack;

public class SortArrayWithStack {

    public static void main(String[] args) {
        int[] arr = {4,5,6,3,2,7};

        helper(arr);
    }

    public static void helper(int[] arr)
    {

        //4,5,6,3,2,7

        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        stack1.push(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if(stack1.peek()>arr[i]) {
                while (!stack1.empty() && stack1.peek() > arr[i]) {
                    stack2.push(stack1.pop());
                }
                stack1.push(arr[i]);
                while (!stack2.empty()) {
                    stack1.push(stack2.pop());
                }
            }
            else {
                stack1.push(arr[i]);
            }
        }
        System.out.println(stack1);


    }
}
