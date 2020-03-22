class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x){
        val = x;
    }
    TreeNode(){
    }
}

public class reConstructBinaryTree {
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        if(pre.length != in.length){
            return null;
        }
        if(pre.length == 0){
            return null;
        }
        int length = pre.length;
        int rootValue = pre[0];
        TreeNode root = new TreeNode(rootValue);
        int index = 0;
        for(; index < length; index++){
            if(in[index] == rootValue){
                break;
            }
        }
        if(index >=length){
            return null;
        }
        int leftLength = index;
        int rightLength = length - index - 1;
        int []leftPre = new int[leftLength];
        int []leftIn = new int[leftLength];
        int []rightPre = new int[rightLength];
        int []rightIn = new int[rightLength];
        for(int i = 0; i < length; i++){
            if(i < index){
                leftPre[i] = pre[i+1];
                leftIn[i] = in[i];
            }else if(i > index){
                rightPre[i - index - 1] = pre[i];
                rightIn[i - index - 1] = in[i];
            }
        }
        root.left = reConstructBinaryTree(leftPre, leftIn);
        root.right = reConstructBinaryTree(rightPre, rightIn);
        return root;
    }
}
