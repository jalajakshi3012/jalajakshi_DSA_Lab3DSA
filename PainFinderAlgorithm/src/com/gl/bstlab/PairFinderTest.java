package com.gl.bstlab;

import java.util.Scanner;

public class PairFinderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BinarySearchTree bst = BSTUtils.sampleBST();
		System.out.println("Enter the sum");
		Scanner sc = new Scanner(System.in);
		Integer sum = sc.nextInt();
		PairFinder pairs = new PairFinder(bst, sum);
		pairs.findAllPairs();
		sc.close();

	}

}
