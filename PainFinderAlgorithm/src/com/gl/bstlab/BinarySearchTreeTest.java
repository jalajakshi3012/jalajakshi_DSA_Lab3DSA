package com.gl.bstlab;

public class BinarySearchTreeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BinarySearchTree bst = BSTUtils.sampleBST();
		
		Node root=bst.getRoot();
		System.out.println(root.getData());
		
		Node left=root.getLeft();
		
		System.out.println(left.getData());
		
		System.out.println(root.getRight().getLeft().getData());
		
		System.out.println(root.getRight().getRight().getData());
		
		

	}
}
