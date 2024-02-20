package Stack;
import java.util.Stack;
public class ReverseStack {
    public static void reverseStack(Stack<Integer>input,Stack<Integer>extra){
        if(input.size()<=1){
            return;
        }
        int lastElement=input.pop();
        reverseStack(input,extra);
        while(!input.isEmpty()){
            int top=input.pop();
            extra.push(top);
        }
        input.push(lastElement);
        while (!extra.isEmpty()){
            int top=extra.pop();
            input.push(top);
        }
    }
    public static void main(String[]args){
        Stack<Integer>stack=new Stack<>();
        stack.push(10);
        System.out.println(stack.peek());
        stack.push(20);
        System.out.println(stack.peek());
        stack.push(30);
        System.out.println(stack.peek());
        stack.push(30);
        System.out.println(stack.peek());
        Stack<Integer>extra=new Stack<>();
        reverseStack(stack,extra);
        System.out.println(stack.peek());
    }
}
