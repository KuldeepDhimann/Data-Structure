package Trees;
public class FindNumberOfNode {
    public static int numNode(TreeNode<Integer>root) {
        if (root == null) {
            return -1;
        }
        int count = 1;
        for (int i = 0; i < root.children.size(); i++) {
            count = count + numNode(root.children.get(i));
        }
        return count;
    }
}
