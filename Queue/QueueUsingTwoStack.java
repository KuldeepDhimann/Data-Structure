package Queue;
import java.util.*;
public class QueueUsingTwoStack<T> {
    public Stack<T>s1;
    public Stack<T>s2;
    public QueueUsingTwoStack(){
        s1=new Stack<>();
        s2=new Stack<>();
    }
    public int size(){
        return s1.size();
    }
    public Boolean isEmpty(){
        return s1.isEmpty();
    }
    public void enqueue(T element){
        s1.push(element);
    }
    public int dequeue(){
        if(!s1.isEmpty()){
            // throw queue is empty
        }
        while(s1.size()>1){
            s2.push(s1.pop());
        }
        T temp=s1.pop();
        return (int)temp;
    }
    public int top(){
        if(!s1.isEmpty()){
            // throw queue is empty
        }
        while(s1.size()>1){
            s2.push(s1.pop());
        }
        T temp=s1.pop();
        s1.push(temp);
        return (int)temp;
    }
}
