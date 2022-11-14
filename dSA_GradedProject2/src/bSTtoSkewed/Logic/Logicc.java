package bSTtoSkewed.Logic;

import bSTtoSkewed.CreationOfNode.Node;

public class Logicc {
	public Node node;   
    Node previous = null; 
    public Node NewHeadd = null;
    public void BSTtoSKEWW(Node root)
    {
        if(root == null)return;
        BSTtoSKEWW(root.getLeft());
        Node rightNode = root.getRight();
        if(NewHeadd == null)   //This updates New headd to hold new root

        {
            NewHeadd = root;
            root.setLeft(null);
            previous = root;
        }
        else
        {
            previous.setRight(root); //update the right of predecessor and also the predecessor to accomodate next node
            root.setLeft(null);  
            previous = root;
        }
        BSTtoSKEWW(rightNode);
    }  
    public void Displayy(Node root)
    {
        if(root == null)return;
        System.out.print(root.Value + " ");
        Displayy(root.getRight());       
    }
}
