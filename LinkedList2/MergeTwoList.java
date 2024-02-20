package LinkedList2;
public class MergeTwoList extends TakingInputLL{
    public static Node<Integer> mergeTwoList(Node<Integer>head1,Node<Integer>head2){
       if(head1==null){
           return head2;
       }
       if(head2==null){
           return head1;
       }
       Node<Integer>t1=head1,t2=head2;
       Node<Integer>head=null,tail=null;
       if(t1.data<t2.data){
           head=t1;
           tail=t1;
           t1=t1.next;
       }
       else{
         head=t2;
         tail=t2;
         t2=t2.next;
       }
       while (t1!=null&&t2!=null){
           if(t1.data<t2.data){
               tail.next=t1;
               tail=t1;
               t1=t1.next;
           }else{
               tail.next=t2;
               tail=t2;
               t2=t2.next;
           }
       }
       return head;
    }
    public static void main(String[]args){
        Node<Integer>head1=takingInput2();
        print(head1);
        Node<Integer>head2=takingInput2();
        print(head2);
        Node<Integer>head=mergeTwoList(head1,head2);
        print(head);

    }

}
