package BinaryTree;
public class NumberOfNode {
    public static int numNode(BinaryTreeNode<Integer>root){
        if(root==null){
            return 0;
        }
        int leftNodeCount=numNode(root.left);
        int rightNodeCount=numNode(root.right);
        return 1+leftNodeCount+rightNodeCount;
    }
}
