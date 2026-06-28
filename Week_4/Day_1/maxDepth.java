class Solution {
    public int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        int LeftMax=maxDepth(root.left); //left
        int RightMax=maxDepth(root.right); //right
        return Math.max(LeftMax,RightMax)+1; // curr
    }
}