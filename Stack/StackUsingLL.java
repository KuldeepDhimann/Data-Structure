package Stack;
public class StackUsingLL<T>{
    private Node<T>head;
    private int size;
    public StackUsingLL(){
        head=null;
        size=0;
    }
    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return size==0;
    }
    public  void push(T element){
        Node<T>newNode=new Node<>(element);
        newNode.next=head;
        head=newNode;
        size++;
    }
    public T pop(){
        if(head==null){
            //stack is empty
            //throw new stack empty exception
        }
        T temp=head.data;
        head=head.next;
        size--;
        return temp;
    }
    public T top(){
        if(head==null){
            //stack is empty exception
        }
        return head.data;

    }
    public static void  main(String[]args){
        StackUsingLL<Integer>stack=new StackUsingLL<>();
        stack.push(10);
        System.out.println(stack.top());
        stack.push(20);
        System.out.println(stack.top());
        stack.push(30);
        System.out.println(stack.top());
        stack.push(40);
        System.out.println(stack.top());
    }
}
