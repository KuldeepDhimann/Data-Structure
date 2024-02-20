package LinkedList2.Assignmernt;

import java.util.Scanner;

public class TakingInputLL {
    //taking input in O(n^2)
    public static Node<Integer> takeInput1(){
        Scanner in=new Scanner(System.in);
        int data=in.nextInt();
        Node<Integer> head=null;
        while(data!=-1){
            Node<Integer> currentNode=new Node<>(data);
            if(head==null){
                head=currentNode;
            }
            else{
                Node<Integer> temp=head;
                while(temp.next!=null){
                    temp=temp.next;
                }
                temp.next=currentNode;
            }
            data=in.nextInt();
        }
        return head;
    }

    //taking input in O(n)
    public static Node<Integer> takingInput2(){
        Scanner in=new Scanner(System.in);
        int data=in.nextInt();
        Node<Integer> head=null;
        Node<Integer> tail=null;
        while(data!=-1){
            Node<Integer> currentnNode=new Node<>(data);
            if(head==null&&tail==null){
                head=currentnNode;
                tail=currentnNode;
            }
            else{
                tail.next=currentnNode;
                tail=currentnNode;
            }
            data=in.nextInt();
        }
        return head;
    }
    public static void print(Node<Integer> head){
        Node<Integer> temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void main(String[]args){
        Node<Integer> head=takingInput2();//takeInput1();
        print(head);
    }
}
