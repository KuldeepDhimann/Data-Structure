package LinkedList2;
public class MidPointLL extends TakingInputLL {
    public static Node<Integer>midPointLL(Node<Integer>head){
        Node<Integer>slow=head,fast=head;
        while(fast.next!=null&&fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public static void main(String[]args){
        Node<Integer>head=takingInput2();
        Node<Integer>mid=midPointLL(head);
        System.out.println(mid.data);
    }
}
