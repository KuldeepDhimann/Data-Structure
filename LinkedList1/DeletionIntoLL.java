package LinkedList1;

public class DeletionIntoLL extends TakingInputLL{
    public static Node<Integer> deleteIntoLL(Node<Integer>head,int pos){
        if(pos==0){
            head=head.next;
            return head;
        }else{
            int count=0;
            Node<Integer>prev=head;
            while(count<pos-1&&prev!=null){
                prev=prev.next;
                count++;
            }
            if(prev!=null){
                prev.next=prev.next.next;
            }
        }
        return head;
    }
    public static void main(String []args){
        Node<Integer>head=takingInput2();
        print(head);
        head= deleteIntoLL(head,5);
        print(head);
    }

}
