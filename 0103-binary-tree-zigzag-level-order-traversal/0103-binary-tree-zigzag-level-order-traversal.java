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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
  List<List<Integer>> res = new ArrayList<>();
        if(root==null){
            return res;
        }
        int i=1;
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.add(root);
        while(!q.isEmpty()){
            i=~i;
            List<Integer> cur = new LinkedList<Integer>();
            int size = q.size();
            for (int j=0; j<size; j++){
                TreeNode temp = q.poll();
                cur.add(temp.val);
                if(temp.left!=null){
                    q.add(temp.left);
                }
                if(temp.right!=null){
                    q.add(temp.right);
                }
            }
           if(i!=1){
               res.add(cur);
           }
            else{
                Collections.reverse(cur);
                res.add(cur);
            }
        }
        return res;
    }
}
