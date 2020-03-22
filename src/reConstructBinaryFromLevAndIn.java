
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class reConstructBinaryFromLevAndIn {
    public TreeNode LevMidRestore(int []lev, int[]mid){
        if(lev.length != mid.length || lev == null || mid == null){
            return null;
        }
        TreeNode [] midHelp = new TreeNode[mid.length];
        TreeNode root = new TreeNode(lev[0]);
        boolean success ;
        int mi = findIndex(mid, lev[0]);
        midHelp[mi] = root;

        for(int i = 1; i < lev.length; i++){
            success = false;
            mi = findIndex(mid, lev[i]);
            midHelp[mi] = new TreeNode(lev[i]);
            for(int p = mi - 1; p >= 0; p--){
                if(midHelp[p] != null){
                    if (midHelp[p].right == null){
                        midHelp[p].right = midHelp[mi];
                        success = true;
                    }
                    break;
                }
            }
            if(success){
                continue;
            }
            for(int p = mi + 1; p < mid.length; p++){
                if(midHelp[p] != null){
                    if(midHelp[p].left == null){
                        midHelp[p].left = midHelp[mi];
                        success = true;
                    }
                    break;
                }
            }
            if(!success){
                break;
            }
        }
        return root;
    }

    public void inOrder(TreeNode root){
        if(root == null){
            return;
        }
        TreeNode p = root;
        Stack<TreeNode> stack = new Stack<>();
        while(p !=null || !stack.isEmpty()){
            while(p!=null){
                stack.push(p);
                p = p.left;
            }
            if(!stack.isEmpty()){
                p = stack.pop();
                System.out.print(p.val);
                p = p .right;
            }
        }
    }
    public void levorder(TreeNode root){
        if(root == null){
            return;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        TreeNode p;
        while (!queue.isEmpty()){
            p = queue.poll();
            System.out.print(p.val);
            if(p.left != null){
                queue.offer(p.left);
            }
            if(p.right != null ){
                queue.offer(p.right);
            }
        }
    }

    private int findIndex(int[] nums, int val){
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == val){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        int []lev = {1,2,3,4,5,6,7};
        int []mid = {4,2,1,6,5,7,3};
        reConstructBinaryFromLevAndIn solu = new reConstructBinaryFromLevAndIn();
        TreeNode root = solu.LevMidRestore(lev, mid);
        solu.inOrder(root);
        System.out.println();
        solu.levorder(root);

    }
}
