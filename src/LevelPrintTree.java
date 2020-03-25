import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class LevelPrintTree {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer>  res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if(root == null){
            return res;
        }
        queue.offer(root);
        while(!queue.isEmpty()){
            TreeNode p = queue.poll();
            res.add(p.val);
            if(p.left != null){
                queue.add(p.left);
            }
            if(p.right != null){
                queue.add(p.right);
            }
        }
        return res;
    }
}
