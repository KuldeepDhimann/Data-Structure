package Queue.Assingment;
import java.util.*;
public class reverseKElement {
    public static Queue<Integer> reverseKElement(Queue<Integer>input,int k){
        if(input.isEmpty()||k>input.size()){
            return input;
        }
        if(k<=0){
            return input;
        }
        Stack<Integer>stack=new Stack<>();
        for(int i=0;i<k;i++){
            stack.push(input.poll());
        }
        while (!stack.isEmpty()){
            input.add(stack.pop());
        }
        for(int i=0;i<input.size()-k;i++){
            input.add(input.poll());
        }
        return input;
    }
}
