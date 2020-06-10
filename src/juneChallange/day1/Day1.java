package juneChallange.day1;
/**
amangupta
*/
public class Day1 {
	public static void main(String[] args) {
		
	}
}

class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode() {}
     TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;
         this.right = right;
     }
 }

class Solution {
public TreeNode invertTree(TreeNode root) {
       TreeNode tempNode;
		if(root==null) {
       	return root;
       }
       tempNode=root.left;
       root.left=root.right;
       root.right=tempNode;
		invertTree(root.left);
		invertTree(root.right);
		return root;
   }
}
