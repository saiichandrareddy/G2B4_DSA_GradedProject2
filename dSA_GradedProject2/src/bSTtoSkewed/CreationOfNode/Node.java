package bSTtoSkewed.CreationOfNode;

public class Node{
	public int Value;
	private Node left;
	private Node right;
	public Node(int val){
		this.Value = val;
	}
	public Node getLeft() {
		return left;
	}
	public void setLeft(Node left) {
		this.left = left;
	}
	public Node getRight() {
		return right;
	}
	public Node setRight(Node right) {
		this.right = right;
		return right;
	}
}
