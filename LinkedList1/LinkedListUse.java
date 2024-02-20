package LinkedList1;

public class LinkedListUse {
    public static Node<Integer> createLinkedList(){
        Node<Integer>n1=new Node<>(10);
        Node<Integer>n2=new Node<>(20);
        Node<Integer>n3=new Node<>(30);
        Node<Integer>n4=new Node<>(40);
        Node<Integer>n5=new Node<>(50);
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        return n1;
    }
    public static void print(Node<Integer> head){
        Node<Integer>temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void increment(Node<Integer>head){
        Node<Integer>temp=head;
        while(temp!=null){
            temp.data+=1;
            temp=temp.next;
        }
        print(head);
    }

    public static int length(Node<Integer>head){
        Node<Integer>temp=head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }
    public static void printIthNode(Node<Integer>head,int i){
        int pos=0;
        Node<Integer>temp=head;
        while(temp!=null && pos<i){
            temp=temp.next;
            pos++;
        }
        if(temp!=null){
            System.out.println(temp.data);
        }
    }
    public static void main(String[]args){
        Node<Integer>arr=createLinkedList();
        print(arr);
        increment(arr);
        //print(arr);
        System.out.println(length(arr));
    }
}
