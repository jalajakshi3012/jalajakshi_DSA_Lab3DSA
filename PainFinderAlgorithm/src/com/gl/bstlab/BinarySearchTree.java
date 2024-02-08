package com.gl.bstlab;

public class BinarySearchTree {

	Node root;

	public Node getRoot() {
		return root;
	}

	void insertNode(int value) {

		Node newNode = new Node(value);

		if (root == null) {
			root = newNode;
		} else {

			NodeInsertionDetails nodeDetails = constructNodeDetails(value);

			Node parentNode = nodeDetails.getParent();

			String direction = nodeDetails.getNodeDirection();

			if (direction.equals("LEFT")) {

				parentNode.setLeft(newNode);
			} else if (direction.equals("RIGHT")) {
				parentNode.setRight(newNode);
			}
		}

	}

	NodeInsertionDetails constructNodeDetails(Integer data) {

		NodeInsertionDetails nid = new NodeInsertionDetails();

		traverseTree(root, data, nid);

		return nid;
	}

	void traverseTree(Node aNode, Integer data, NodeInsertionDetails details) {

		if (data <= aNode.getData()) {

			Node leftNode = aNode.getLeft();

			if (leftNode != null) {
				traverseTree(leftNode, data, details);
			} else {
				details.setParent(aNode);
				details.setNodeDirection("LEFT");
			}
		} else {

			Node rightNode = aNode.getRight();

			if (rightNode != null) {
				traverseTree(rightNode, data, details);
			} else {

				details.setParent(aNode);
				details.setNodeDirection("RIGHT");
			}
		}
	}

}