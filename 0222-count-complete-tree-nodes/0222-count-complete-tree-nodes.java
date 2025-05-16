/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int countNodes(TreeNode root) {
        if (root == null) return 0;

        int height = getHeight(root);
        if (height == 0) return 1;

        int left = 0, right = (1 << height) - 1;  // max nodes at last level

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (exists(root, height, mid)) {
                left = mid + 1;  // node exists, search right half
            } else {
                right = mid - 1; // node doesn't exist, search left half
            }
        }

        // Nodes above last level + nodes on last level
        return (1 << height) - 1 + left;
    }

    // Compute tree height (count edges from root to leftmost leaf)
    private int getHeight(TreeNode node) {
        int h = 0;
        while (node.left != null) {
            node = node.left;
            h++;
        }
        return h;
    }

    // Check if node at index 'idx' exists at last level
    private boolean exists(TreeNode root, int height, int idx) {
        int left = 0, right = (1 << height) - 1;

        for (int i = 0; i < height; i++) {
            int mid = left + (right - left) / 2;
            if (idx <= mid) {
                root = root.left;
                right = mid;
            } else {
                root = root.right;
                left = mid + 1;
            }
        }
        return root != null;
    }
}
