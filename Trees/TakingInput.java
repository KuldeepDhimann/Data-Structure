package Trees;
import com.sun.source.tree.Tree;

import java.util.*;
public class TakingInput {
    public static TreeNode<Integer> takingInput(Scanner s){
        int n;
        System.out.println("enter the node ");
        n=s.nextInt();
        TreeNode<Integer>root=new TreeNode<>(n);
        System.out.println("enter the no. of child for "+n);
        int countNode=s.nextInt();
        for(int i=0;i<countNode;i++){
            TreeNode<Integer>childNode=takingInput(s);
            root.children.add(childNode);
        }
        return root;
    }
    public static void printTree(TreeNode<Integer>root) {
        String s = root.data + ":";
        int i;
        for (i = 0; i < root.children.size(); i++) {
            s = s + root.children.get(i).data + ",";
        }
      //  s = s + root.children.get(i).data;
        System.out.println(s);
        for(int j=0;j<root.children.size();j++){
            printTree(root.children.get(j));
        }
    }
}
