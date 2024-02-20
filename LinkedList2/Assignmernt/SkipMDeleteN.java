package LinkedList2.Assignmernt;

//import LinkedList2.LinkedList1.TakingInputLL;

public class SkipMDeleteN extends TakingInputLL {
    public static Node<Integer> skipMDeleteN(Node<Integer>head,int m,int n){
       if(m==0&&head==null){
           return null;
       }
       if(n==0){
           return head;
       }
       Node<Integer>currentNode=head;
       Node<Integer>temp=null;
       while(currentNode!=null){
           int take=0;
           int skip=0;
           while(currentNode!=null&&take<m){
               if(temp==null){
                   temp=currentNode;
               }else{
                   temp.next=currentNode;
                   temp=currentNode;
               }
               currentNode=currentNode.next;
               take++;
           }
           while(currentNode!=null&&skip<n){
               currentNode=currentNode.next;
               skip++;
           }
       }
       if(temp!=null){
           temp.next=null;
       }
       return head;
    }
    public static void main(String []args){
        Node<Integer>head=takingInput2();
        print(head);
        head=skipMDeleteN(head,2,3);
        print(head);
    }
}
