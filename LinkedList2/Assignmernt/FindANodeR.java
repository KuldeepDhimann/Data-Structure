package LinkedList2.Assignmernt;

//import LinkedList2.LinkedList1.TakingInputLL;

public class FindANodeR extends TakingInputLL {
    public static int findANodeR(Node<Integer>head,int item){
        if(head==null){
            return -1;
        }
        if(head.data==item){
            return 0;
        }
        int smallAns=findANodeR(head.next,item);
        if(smallAns==-1)
        {
            return -1;
        }
        return smallAns+1;
    }
    public static void main(String[]args){
        Node<Integer> head=takingInput2();
        print(head);
        System.out.println(findANodeR(head,50));
    }
}
