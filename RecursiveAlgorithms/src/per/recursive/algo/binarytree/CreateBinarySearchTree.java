package per.recursive.algo.binarytree;

import java.util.ArrayList;

public class CreateBinarySearchTree {

	public static Node insertNode(Node headNode, Node insertNode)
	{
	
		if(insertNode.data <headNode.data && headNode.leftNode == null)
		{
			headNode.leftNode = insertNode;
			insertNode.parentNode = headNode;
			return insertNode;
		}
		if(insertNode.data >=headNode.data && headNode.rightNode == null)
		{
			headNode.rightNode = insertNode;
			insertNode.parentNode = headNode;
			return insertNode;
		}
		else
		{
			if(insertNode.data <headNode.data)
			{
				Node tempNode = headNode.leftNode;
				return insertNode(tempNode, insertNode);
			}
			else
			{
				Node tempNode = headNode.rightNode;
				return insertNode(tempNode, insertNode);
			}
		}
		
	}
	public static Node getParentNodeFromLeafNode(Node leafNode)
	{
		if(leafNode.parentNode == null)
			return leafNode;
		else
		{
			return getParentNodeFromLeafNode(leafNode.parentNode);
		}
		
	}
	public static Node getTheRightMostLeafOfBST(Node parentNode)
	{
		if(parentNode.rightNode == null)
			return parentNode;
		else
		{
			return getTheRightMostLeafOfBST(parentNode.rightNode);
		}
	}
	
	public static void main(String[] args) {
		
		Node parentNode = new Node(6,null,null,null);
		Node insertedNode = new Node();
		ArrayList<Integer> input = new ArrayList<Integer>();
		input.add(6);
		input.add(9);
		input.add(23);
		input.add(100);
		input.add(11);
		input.add(7);
		for(int i = 1; i<input.size(); i++)
		{
		Node insertNode = new Node(input.get(i),null,null,null);
	        insertedNode = 	insertNode(parentNode,insertNode);
		}
		System.out.println("last node inserted data " +insertedNode.data);
		System.out.println("last node parent data " +insertedNode.parentNode.data);
		System.out.println("parent node of the created binary tree " +getParentNodeFromLeafNode(insertedNode).data);
		System.out.println("right node of parent node of the created binary search tree " +getParentNodeFromLeafNode(insertedNode).rightNode.data);
		System.out.println("last leaf node of the created binary search tree " +getTheRightMostLeafOfBST(getParentNodeFromLeafNode(insertedNode)).data);

	}
}
