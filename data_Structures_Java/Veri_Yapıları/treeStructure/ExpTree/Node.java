package Veri_Yapıları.treeStructure.ExpTree;

/**
 * Node
 */
public class Node {

    public char data;
    public Node leftChild;
    public Node rightChild;

    public Node(char c)
    {
        this.data = c;
        this.leftChild = null;
        this.rightChild = null;
    }

    public void displayNode()
    {
        System.out.print(this.data);
    }
}