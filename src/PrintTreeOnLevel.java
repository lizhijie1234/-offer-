import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class PrintTreeOnLevel {
    ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if(pRoot == null){
            return res;
        }
        queue.add(pRoot);
        while(!queue.isEmpty()){
            ArrayList<Integer> list = new ArrayList<>();
            int count = queue.size();
            while(count -- > 0){
                TreeNode p = queue.poll();
                list.add(p.val);
                if(p.left != null){
                    queue.add(p.left);
                }
                if(p.right != null){
                    queue.add(p.right);
                }
            }
            if(list.size() != 0){
                res.add(list);
            }
        }
        return res;
    }
}
