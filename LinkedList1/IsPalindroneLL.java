package LinkedList1;

public class IsPalindroneLL  extends TakingInputLL {
    public static Node<Integer> reverseLinkedList(Node<Integer>head){
        Node<Integer>curr=head;
        Node<Integer>prev=null;
        Node<Integer>fwd=null;
        while(curr!=null){
            fwd=curr.next;
            curr.next=prev;
            prev=curr;
            curr=fwd;
        }
        return prev;
    }
    public static boolean isPalindrome(Node<Integer>head){
        if(head==null||head.next==null){
            return true;
        }
        Node<Integer>fast=head;
        Node<Integer>slow=head;
        while(fast.next!=null&&fast.next.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        Node<Integer>secondhead=slow.next;
        slow.next=null;
        Node<Integer>firstSubList=secondhead;
        Node<Integer>secondSubList=head;
        while(firstSubList!=null){
            if(firstSubList.data!=secondSubList.data){
                return false;
            }
            firstSubList=firstSubList.next;
            secondSubList=secondSubList.next;
        }
        firstSubList=head;
        secondSubList=reverseLinkedList(secondhead);
        while(firstSubList.next==null){
            firstSubList=firstSubList.next;
        }
        firstSubList.next=secondSubList;
        return true;
    }
    public static void main(String []args){
        Node<Integer>head=takingInput2();
        System.out.println(isPalindrome(head));
    }
}
