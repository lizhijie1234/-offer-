
class TreeLinkNode {
    int val;
    TreeLinkNode left = null;
    TreeLinkNode right = null;
    TreeLinkNode next = null;

    TreeLinkNode(int val) {
        this.val = val;
    }
}

public class TreeNextNode {
    public TreeLinkNode GetNext(TreeLinkNode pNode){
        if(pNode == null){
            return null;
        }
        if(pNode.right != null){
            TreeLinkNode next = pNode.right;
            while(next.left != null){
                next = next.left;
            }
            return next;
        }else{
            TreeLinkNode parent = pNode.next;
            TreeLinkNode pCurrent = pNode;
            while(parent != null && parent.left != pCurrent){
                pCurrent = parent;
                parent = pCurrent.next;
            }
            return parent;
        }
    }

}
