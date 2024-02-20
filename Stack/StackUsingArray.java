package Stack;
public class StackUsingArray {
    private int data[];
    private int topIndex;
    public StackUsingArray(){
        data=new int[10];
        topIndex=-1;
    }
    public StackUsingArray(int size){
        data=new int [size];
        topIndex=-1;
    }
    public boolean isEmpty(){
        if(topIndex==-1)
            return true;
        return false;
    }
    public void push(int element){
        if(topIndex== data.length-1){
            //show StackFullException
            DoubleCapacity();
        }
        ++topIndex;
        data[topIndex]=element;
    }
    public void DoubleCapacity(){
        int temp[]=data;
        data=new int[2*temp.length];
        for(int i=0;i<temp.length;i++){
            data[i]=temp[i];
        }
    }
    public int top(){
        if(topIndex==-1){
            //StackEmptyException
            return -1;
        }
        return data[topIndex];
    }
    public int pop(){
        if(topIndex==-1){
            //StackEmptyException
            return -1;
        }
        int temp=data[topIndex];
        topIndex--;
        return temp;
    }
    public static void main(String[]args){
        StackUsingArray stack=new StackUsingArray();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        for(int i=0;i<=stack.topIndex;i++){
            System.out.println(stack.data[i]);
        }
        System.out.println(stack.top());
        System.out.println(stack.isEmpty());
    }

}
