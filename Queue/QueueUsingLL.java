package Queue;

public class QueueUsingLL<T> {
    private Node<T>front;
    private Node<T>rear;
    private int size;
    public QueueUsingLL(){
        front=null;
        rear=null;
        size=0;
    }
    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return size==0;
    }
    public void enqueue(T element){
        Node<T>newNode=new Node<>(element);
        size++;
        if(rear==null){
            front=newNode;
            rear=newNode;
        }else{
            rear.next=newNode;
            rear=newNode;
        }
    }
    public int peek(){
        if(front==null){
            //queue is empty
            // throw new QueueIsEmptyException
        }
        T temp=front.data;
        return (int)temp;
    }
    public int dequeue(){
        if(front==null){
            //throw new QueueIsEmptyException
        }
        T temp=front.data;
        front=front.next;
        if(front==null){
            rear=null;
        }
        size--;
        return (int)temp;
    }
}
