package LinkedList2.Assignmernt;

//import LinkedList2.LinkedList1.TakingInputLL;

public class EvenAfterOdd extends TakingInputLL {
    public static Node<Integer> evenAfterOdd(Node<Integer>head){
        if(head==null){
            return head;
        }
        Node<Integer> evenHead=null,evenTail=null;
        Node<Integer> oddHead=null,oddTail=null;
        while(head!=null){
            if(head.data%2==0){
                if(evenHead==null){
                    evenHead=head;
                    evenTail=head;
                }
                else{
                    evenTail.next=head;
                    evenTail=evenTail.next;
                }
            }
            else{
                if(oddHead==null){
                    oddHead=head;
                    oddTail=head;
                }
                else{
                    oddTail.next=head;
                    oddTail=oddTail.next;
                }
            }
            head=head.next;
        }
        if(oddHead==null){
            return evenHead;
        }
        else{
            oddTail.next=evenHead;
        }
        if(evenHead!=null){
            evenTail.next=null;
        }
        return oddHead;
    }
    public static void main(String []args){
        Node<Integer>head=takingInput2();
        print(head);
        head=evenAfterOdd(head);
        print(head);
    }
}
