package Trees;

import java.util.Scanner;

public class TakingInputLevelWise{
    public static TreeNode<Integer>takingInputLevelWise(){
        Scanner input =new Scanner(System.in);
        int rootData=input.nextInt();
        TreeNode<Integer>root=new TreeNode<>(rootData);
        QueueUsingLL<TreeNode<Integer>> pendingNodes=new QueueUsingLL<>();
        pendingNodes.enqueue(root);
        while (!pendingNodes.isEmpty()){
            TreeNode<Integer>frontNode=pendingNodes.dequeue();
            System.out.println("enter the children of "+frontNode.data);
            int childNum=input.nextInt();
            for(int i=0;i<childNum;i++){
                System.out.println("enter "+(i+1)+"th child for "+frontNode.data);
                int child=input.nextInt();
                TreeNode<Integer>childNode=new TreeNode<>(child);
                root.children.add(childNode);
                pendingNodes.enqueue(childNode);
            }
        }
        return root;
    }
    public static void printLevelWise(TreeNode<Integer>root){
        String s;
        QueueUsingLL<TreeNode<Integer>>pendingNodes=new QueueUsingLL<>();
        pendingNodes.enqueue(root);
        while (!pendingNodes.isEmpty()){
            TreeNode<Integer>frontNode=pendingNodes.dequeue();
            s=frontNode.data+":";
            for(int i=0;i<frontNode.children.size();i++){
                s=s+frontNode.children.get(i).data;
                pendingNodes.enqueue(frontNode);
            }
            System.out.println(s);
        }
    }
}
