package bSTtoSkewed.Main;

import bSTtoSkewed.Logic.Logicc;
import bSTtoSkewed.CreationOfNode.Node;

public class Mainn {
	static Logicc tree = new Logicc();
	public static void main(String[] args) {
		tree.node = new Node(50);
        tree.node.setLeft(new Node(30));
        tree.node.setRight(new Node(60));
        tree.node.getLeft().setLeft(new Node(10));
        tree.node.getRight().setLeft(new Node(55));
        tree.BSTtoSKEWW(tree.node); // Converts the Binary search TREE to a Skewed one
        tree.Displayy(tree.NewHeadd); // Prints the Skewed Tree
	}
}
