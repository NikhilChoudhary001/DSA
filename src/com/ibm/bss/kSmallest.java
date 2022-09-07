package com.ibm.bss;

public class kSmallest {
	
	static int val = 0;
	static int k = 3;
	
	TreeNode root;
	
	  //Definition for a binary tree node.
	  public static class TreeNode {
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
	 
	
	    public static int kSmallest(TreeNode root) {
	       
	    if(root == null){
	        return 0;
	    }
	    
	    // below code is simple and will also work
//	    kSmallest(root.left);
//	    
//	    k--;
//	    if(k == 0) {
//	    	System.out.println("k smallest is" + root.val);
//	    }
//	    kSmallest(root.right);
	   
	    // bigger code , still works
	    val = kSmallest(root.left);
	   
	    if(val != 0) {
	    	return val;
	    }
	    
		if(k == 0){
		return root.val ;
		}else {
		    k = k -1;
		}
		    
		val = kSmallest(root.right);
		
		if(val != 0) {
	    	return val;
	    }
		
		return val;
	    }
	    
	    
	    public static void main(String a[]) {
			kSmallest tree = new kSmallest();
			
			tree.root = new TreeNode(3);
		    tree.root.left = new TreeNode(1);
		    tree.root.right = new TreeNode(4);
		    tree.root.left.right = new TreeNode(2);
		    
		    int ele = kSmallest(tree.root);
		    
		  
		    System.out.println("k smallest is" + ele);
		    
		}
	

}
