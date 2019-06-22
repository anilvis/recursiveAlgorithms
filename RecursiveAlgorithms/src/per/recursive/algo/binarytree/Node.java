package per.recursive.algo.binarytree;

public class Node {

	int data;
	Node leftNode;
	Node rightNode;
	
	public Node()
	{
		data = 0;
		leftNode = null;
		rightNode = null;
		
	}
	public Node(int data, Node left, Node right)
	{
		this.data = data;
		this.leftNode = left;
		this.rightNode = right;
	}
}