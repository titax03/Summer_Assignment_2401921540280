class Solution {
    public boolean isValidBST(TreeNode root) {
        return isBst(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private boolean isBst(TreeNode root, long min, long max) {
        if (root == null) {
            return true;
        }

        // Check current node
        if (root.val <= min || root.val >= max) {
            return false;
        }

        // Check left and right subtree
        return isBst(root.left, min, root.val) &&
               isBst(root.right, root.val, max);
    }
}