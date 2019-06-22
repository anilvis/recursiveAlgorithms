package per.recursive.algo.binarytree;

import java.util.ArrayList;

public class CreateBinarySearchTree {

	public static Node insertNode(Node headNode, Node insertNode)
	{
	
		if(insertNode.data <headNode.data && headNode.leftNode == null)
		{
			headNode.leftNode = insertNode;
			return insertNode;
		}
		if(insertNode.data >=headNode.data && headNode.rightNode == null)
		{
			headNode.rightNode = insertNode;
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
	public static void main(String[] args) {
		
		Node parentNode = new Node(6,null,null);
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
			Node insertNode = new Node(input.get(i),null,null);
	        insertedNode = 	insertNode(parentNode,insertNode);
		}
		System.out.println("head node data "+parentNode.data);
		System.out.println("left node data" +insertedNode.data);

	}
}
