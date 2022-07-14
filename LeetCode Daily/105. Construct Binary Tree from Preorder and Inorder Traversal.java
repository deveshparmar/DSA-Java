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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer,Integer>hm = new HashMap();
        for(int i=0;i<inorder.length;i++)
            hm.put(inorder[i],i);
        
        return makeTree(inorder,preorder,0,inorder.length-1,0,hm);
    }
    
    private TreeNode makeTree(int[] inorder,int[] preorder, int start, int end, int idx,HashMap<Integer,Integer>hm){
        if(start>end || idx > preorder.length)
            return null;
        
        TreeNode root = new TreeNode(preorder[idx]);
        int index = hm.get(preorder[idx]);
        
        root.left = makeTree(inorder,preorder,start,index-1,idx+1,hm);
        root.right = makeTree(inorder,preorder,index+1,end,index+idx-start+1,hm);
        
        return root;
    }
}
