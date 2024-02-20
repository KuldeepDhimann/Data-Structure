package Trees;

public class LargestNode {
    public static int largestNode(TreeNode<Integer>root){
        if(root==null){
            return -1;
        }
        int rootData=root.data;
        for(int i=0;i<root.children.size();i++){
            int chlidrenLargest=largestNode(root);
            if(rootData<chlidrenLargest){
                rootData=chlidrenLargest;
            }
        }
        return rootData;
    }
}
