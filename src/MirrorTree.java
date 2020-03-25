public class MirrorTree {
    public void Mirror(TreeNode root) {
        if(root == null){
            return ;
        }
        swapChild(root);
        Mirror(root.left);
        Mirror(root.right);
    }
    private void swapChild(TreeNode node){
        TreeNode temp = node.left;
        node.left = node.right;
        node.right = temp;
    }
}
