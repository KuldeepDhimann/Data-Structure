package LinkedList2;
public class InsertRecursive extends TakingInputLL{
    public static int length(Node<Integer>head){
        int count=0;
        while (head!=null){
            count++;
        }
        return count;
    }
    public static Node<Integer> deleteRecursive(Node<Integer>head,int index){
        if(head==null){
            return head;
        }
        if(index==0){
            head=head.next;
            return head;
        }
        else{
            Node<Integer>samllHead=deleteRecursive(head.next,index-1);
            head.next=samllHead;
            return head;
        }
    }
    public static Node<Integer> insertRecursive(Node<Integer>head,int item,int index){
        if(head==null&&index>0){
            return head;
        }
        if(index==0){
            Node<Integer>newNode=new Node<>(item);
            newNode.next=head;
            head=newNode;
            return head;
        }
        else{
            Node<Integer>smallHead=insertRecursive(head.next,item,index-1);
            head.next=smallHead;
            return head;
        }
    }
    public static void main(String[]args){
        Node<Integer>head=takingInput2();
        print(head);
        //System.out.println(length(head));
        //head=insertRecursive(head,100,4);
        head=deleteRecursive(head,0);
        print(head);
    }
}
