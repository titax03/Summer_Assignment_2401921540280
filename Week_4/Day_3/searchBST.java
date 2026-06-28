class Solution {
    TreeNode res = null;
    public TreeNode searchBST(TreeNode root, int val) {
        if(root==null){
            return null;
        }
        if(root.val==val){
            return root;
        }
        if(root.val>val){
            res=searchBST(root.left, val);
        }else{
            res=searchBST(root.right, val);
        }
        return res;
    }
}