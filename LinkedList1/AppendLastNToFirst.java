package LinkedList1;

public class AppendLastNToFirst extends TakingInputLL{
    public static Node<Integer> appendLastToFirst(Node<Integer>head,int n){
        if(n==0||head==null){
            return head;
        }
        Node<Integer>fast=head;
        Node<Integer>slow=head;
        Node<Integer>initialhead=head;
        for(int i=0;i<n;i++){
            fast=fast.next;
        }
        while(fast.next!=null){
            fast=fast.next;
            slow=slow.next;
        }
        Node<Integer>temp=slow.next;
        slow.next=null;
        fast.next=initialhead;
        head=temp;
        return head;
    }
    public static void main(String[]args){
        Node<Integer>head=takingInput2();
        print(head);
        head=appendLastToFirst(head,3);
        print(head);
    }
}
