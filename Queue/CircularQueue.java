package Queue;

import javax.management.timer.TimerMBean;
import javax.naming.PartialResultException;

public class CircularQueue {
    private int data[];
    private int front;
    private int rear;
    private int size;
    public CircularQueue(){
        data=new int[5];
        front=-1;
        rear=-1;
        size=0;
    }
    public void enqueue(int element){
        if(size== data.length){
            // throw new StackIsFullException
        }
        if(size==0){
          front=0;
        }
        rear=(rear+1)%data.length;
        data[rear]=element;
        size++;
    }
    public int dequeue(){
        if(size==0){
            //throw new StackIsEmptyException
        }
        int temp=data[front];
        front=(front+1)%data.length;
        size--;
        if(size==0){
            front=-1;
            rear=-1;
        }
        return temp;
    }
    public void doubleCapacity(){
        int temp[]=data;
        data=new int[2*temp.length];
        int index=0;
        for(int i=front;i<data.length;i++){
            data[index]=temp[i];
            index++;
        }
        for(int i=0;i< front-1;i++){
            data[index]=temp[i];
            index++;
        }
        front=0;
        rear= temp.length-1;
    }
}
