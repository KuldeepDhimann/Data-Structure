package LinkedList2.Assignmernt;

//import LinkedList2.LinkedList1.TakingInputLL;

public class SwapTwoNode extends TakingInputLL {
    public static Node<Integer>swapToNode(Node<Integer>head,int i,int j){
        Node<Integer>curretNode=head,prev=null;
        Node<Integer>firstNode=null,secondNode=null;
        Node<Integer>firstNodePrev=null,secondNodePrev=null;
        int pos=0;
        while(curretNode!=null){
            if(pos==i){
                firstNodePrev=prev;
                firstNode=curretNode;
            }else if(pos==j) {
                secondNodePrev=prev;
                secondNode=curretNode;
            }
            prev=curretNode;
            curretNode=curretNode.next;
            pos++;
        }
        if(firstNodePrev!=null){
            firstNodePrev.next=secondNode;
        }else{
            head=secondNode;
        }
        if(secondNodePrev!=null){
            secondNodePrev.next=firstNode;
        }
        else{
            head=firstNode;
        }
        secondNode.next=firstNode.next;
        firstNode.next=secondNodePrev;
        return head;
    }
    public static void main(String[]args){
        Node<Integer>head=takingInput2();
        print(head);
        head=swapToNode(head,2,4);
        print(head);
    }
}
