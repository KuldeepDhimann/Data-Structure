package LinkedList1;

public class PrintReverseLL extends TakingInputLL{
    public static void printReverse(Node<Integer>head){
        if(head==null){
            return;
        }
        printReverse(head.next);
        System.out.print(head.data+" ");
    }
    public static void main(String[]args){
        Node<Integer>head=takingInput2();
        print(head);
        printReverse(head);
    }
}
