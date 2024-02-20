package Queue;

import java.util.Queue;

public class QueueUsingArray {
    private int data[];
    private int front;
    private int rear;
    private int size;

    public QueueUsingArray(){
        data=new int[5];
        size=0;
        front=-1;
        rear=-1;
    }
    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return size==0;
    }
    public int peek(){
        if(size==0){
             //throw new StackEmptyException;
        }
        return data[front];
    }
    public void enqueue(int element){
        if(size== data.length){
            //throw new Stack is full exception
        }
        if(size==0){
            front=0;
        }
        rear++;
        data[rear]=element;
        size++;
    }
    public int dequeue(){
        if(size==0){
            //throw new stack is empty exception
        }
        int temp=data[front];
        front++;
        size--;
        if(size==0){
            front=-1;
            rear=-1;
        }
        return temp;
    }
}
