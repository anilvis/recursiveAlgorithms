package per.recursive.algo.binarytree;

public class Node {

	int data;
	Node leftNode;
	Node rightNode;
	Node parentNode;
	
	public Node()
	{
		data = 0;
		leftNode = null;
		rightNode = null;
		rightNode = null;
		
	}
	public Node(int data, Node left, Node right, Node parentNode)
	{
		this.data = data;
		this.leftNode = left;
		this.rightNode = right;
		this.parentNode = parentNode;
	}
}