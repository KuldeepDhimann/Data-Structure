package LinkedList2;
public class ReverseLinkedList extends TakingInputLL{
    public static Node<Integer> reverse(Node<Integer>head){
        if(head==null||head.next==null){
            return head;
        }
        Node<Integer>smallHead=reverse(head.next);
        head.next.next=head;
        head.next=null;
        return smallHead;
    }
    public static void main(String[]args){
        Node<Integer>head=takingInput2();
        print(head);
        head=reverse(head);
        print(head);
    }

}
