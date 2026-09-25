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
    int idx = 0;
    HashMap<Integer, Integer> map;
    public TreeNode buildTree(int[] preorder, int[] inorder){
        map = new HashMap<>();
        for(int i = 0; i < inorder.length; i++){
            map.put(inorder[i], i);
        }
        return dfs(preorder, 0, inorder.length - 1);
    }

    public TreeNode dfs(int[] preorder, int l, int r){
        if(l > r){
            return null;
        }
        int mid  = map.get(preorder[idx]);
        TreeNode node = new TreeNode(preorder[idx++]);
        node.left = dfs(preorder, l, mid - 1);
        node.right = dfs(preorder, mid + 1, r);

        return node;
    }
}
