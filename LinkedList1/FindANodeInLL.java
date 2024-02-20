package LinkedList1;

public class FindANodeInLL extends TakingInputLL{
    public  static int findANode(Node<Integer>head,int data){
        if(head==null){
            return -1;
        }
        Node<Integer>temp=head;
        int index=0;
        while(temp!=null){
            if(temp.data==data){
                return index;
            }
            temp=temp.next;
            index++;
        }
        return -1;
    }
    public static void main(String []args){
        Node<Integer>head=takingInput2();
        print(head);
        System.out.println(findANode(head,50));
    }
}
