package BinaryTree;
import Trees.TakingInput;
public class BinaryTreeUse extends TakingTreeInput {
    public static int numNode(BinaryTreeNode<Integer>root){
        if(root==null){
            return 0;
        }
        int leftNodeCount=numNode(root.left);
        int rightNodeCount=numNode(root.right);
        return 1+leftNodeCount+rightNodeCount;
    }
    public static void main(String[]args) {
//        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(1);
//        BinaryTreeNode<Integer> node1 = new BinaryTreeNode<>(2);
//        BinaryTreeNode<Integer> node2 = new BinaryTreeNode<>(3);
//        BinaryTreeNode<Integer> node3 = new BinaryTreeNode<>(4);
//        BinaryTreeNode<Integer> node4 = new BinaryTreeNode<>(5);
//        root.left = node1;
//        root.right = node2;
//        node1.right = node3;
//        node2.left = node4;
//
//        //BinaryTreeNode<Integer>root=takingTreeInput();
//        //System.out.println(root);
//        //printTree(root);

        BinaryTreeNode<Integer>root=takingInputBetter();
        //System.out.println(numNode(root));
        printBetter(root);
    }
}
