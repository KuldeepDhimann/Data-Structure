package Trees;
import java.util.*;
public class TreeNode<T> {
    public T data;
    public ArrayList<TreeNode<Integer>> children;
    public TreeNode(T data){
        this.data=data;
        children=new ArrayList<>();
    }
}

