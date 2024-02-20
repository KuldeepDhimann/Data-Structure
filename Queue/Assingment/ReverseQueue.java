package Queue.Assingment;
import java.util.*;
public class ReverseQueue {
    public static void reverseQueue(Queue<Integer>input){
        if(input.size()<=1){
            return;
        }
        int top=input.poll();
        reverseQueue(input);
        input.add(top);
    }
}
