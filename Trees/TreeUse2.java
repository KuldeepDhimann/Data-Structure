package Trees;

import java.util.Scanner;

public class TreeUse2 extends TakingInputLevelWise{
    public static void main(String []args){
        Scanner s=new Scanner(System.in);
        //TreeNode<Integer>root= takingInput(s);
        //printTree(root);
        TreeNode<Integer>root=takingInputLevelWise();
        printLevelWise(root);
    }
}
