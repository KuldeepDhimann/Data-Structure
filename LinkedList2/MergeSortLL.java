package LinkedList2;

import javax.management.NotificationFilter;

public class MergeSortLL extends TakingInputLL {
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
    public static Node<Integer>midPointLL(Node<Integer>head){
        Node<Integer>slow=head,fast=head;
        while(fast.next!=null&&fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public static Node<Integer> mergeSort(Node<Integer>head){
        if(head==null||head.next==null){
            return head;
        }
        Node<Integer>mid=midPointLL(head);
        Node<Integer>half1=head;
        Node<Integer>half2=mid.next;
        mid.next=null;
        half1=mergeSort(half1);
        half2=mergeSort(half2);
        Node<Integer>finalHead=mergeTwoList(half1,half2);
        return finalHead;

    }
    public static void main(String[]args){
        Node<Integer>head=takingInput2();
        print(head);
        head=mergeSort(head);
        print(head);
    }
}
