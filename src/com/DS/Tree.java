package com.DS;


/*
 * USING TREE B
 * and DFS TREE TRAVERSAL USING RECURSION
 */
public class Tree {

	TreeNode root;
	
	

	public  Tree(String s1){
		root = new TreeNode(s1);
		
	}
	
	
	public void traverseTree(TreeNode tree) {

	    // print, increment counter, whatever
	    System.out.println(tree.getValue());

	    // traverse children
	    int childCount = tree.getChildCount();
	    if (childCount == 0) {
	        // leaf node, we're done
	    } else {
	    	//System.out.println(tree.getValue());
	        for (int i = 0; i < childCount; i++) {
	        	TreeNode child = tree.getChild(i);
	            traverseTree(child);
	        }
	    }
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tree t1 = new Tree("the");
		TreeNode root = t1.root;
		TreeNode temp = new TreeNode("quick");
		root.addChild(0, temp);
		TreeNode temp1 = new TreeNode("brown");
		temp.addChild(0, temp1);
		
		temp = new TreeNode("fox");
		root.addChild(1, temp);
		temp1 = new TreeNode("jumps");
		temp.addChild(0, temp1);
		TreeNode temp2 = new TreeNode("over");
		temp1.addChild(0, temp2);
		temp2 = new TreeNode("the");
		temp1.addChild(1, temp2);
		
		
		temp = new TreeNode("lazy");
		root.addChild(2, temp);
		temp1 = new TreeNode("dog");
		temp.addChild(0, temp1);
		
		t1.traverseTree(root);
	}

}

class TreeNode {

	 TreeNode[] children;

	 String value;
	 
	 int childCount = 0;
	 
	 TreeNode(String s1){
		 value = s1;
		 children = new TreeNode[5];
	 }
	 
	 
	 public void addChild(int i, TreeNode t1){
		 System.out.println(children.length);
		 children[i] = t1;
		 childCount++;
	 }
	 
	 public int getChildCount(){
		 return childCount;
	 }
	 
	 public TreeNode getChild(int i){
		 return children[i];
	 }
	 
	 public String getValue(){
		 return value;
	 }
	 
	}