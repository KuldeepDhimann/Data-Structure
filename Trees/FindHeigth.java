package Trees;
import java.util.*;
public class FindHeigth extends TakingInput {
    public static int findHeight(TreeNode<Integer>root){
        if(root==null){
            return -1;
        }
        int maxHeigth=0;
        for(TreeNode child:root.children){
            maxHeigth=Math.max(maxHeigth,findHeight(child));
        }
        return maxHeigth+1;
    }
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        TreeNode<Integer>root=takingInput(s);
        System.out.println(findHeight(root));
    }
}

