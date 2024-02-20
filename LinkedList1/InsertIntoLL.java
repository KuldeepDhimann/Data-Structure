package LinkedList1;

public class InsertIntoLL extends TakingInputLL {
    public static Node<Integer> insertIntoLL(Node<Integer>head,int data,int pos){
        Node<Integer>currentNode=new Node<>(data);
        if(pos==0){
            currentNode.next=head;
            head=currentNode;
            return head;
        }else{
            int count=0;
            Node<Integer>prev=head;
            while(count<pos-1&&prev!=null){
                count++;
                prev=prev.next;
            }
            if(prev!=null){
                currentNode.next=prev.next;
                prev.next=currentNode;
            }
        }
        return head;
    }
    public static void main(String []args){
        Node<Integer>head=takingInput2();
        print(head);
        insertIntoLL(head,20,5);
        print(head);
    }
}
