
package LinkedList2;
public class PrintRecursive extends TakingInputLL {
    public static void printRecursive(Node<Integer>head) {
        if (head == null) {
            return;
        }
        System.out.print(head.data + " ");
        printRecursive(head.next);
    }
    public static void printReverseRecursive(Node<Integer>head) {
            if (head == null) {
                return;
            }
            printReverseRecursive(head.next);
        System.out.print(head.data+" ");
    }
    public static void main(String []args){
        Node<Integer>head=takingInput2();
        print(head);
        printRecursive(head);
        printReverseRecursive(head);
    }
}
