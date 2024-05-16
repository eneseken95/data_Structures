package Veri_Yapıları.treeStructure.ExpTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class expTree {
    
    public Node root;
    
    public expTree()
    {
        this.root = null;
    }

    public void createExpTree(String s)
    {
        Stack <Node> stk = new Stack<>();

        s = s + "#";
        
        int i = 0;
        char symbol = s.charAt(i);
        // 2 


        while(symbol != '#')
        {
            if((symbol >= '0' && symbol <= '9') || (symbol >= 'a' && symbol <= 'z'))
            {
                Node newNode = new Node(symbol);
                stk.push(newNode);
            }

            else if((symbol == '+'|| symbol == '-' || symbol == '*' || symbol == '/'))
            {
                Node right = stk.pop();
                Node left = stk.pop();

                Node newNode2 = new Node(symbol);

                newNode2.leftChild = left;
                newNode2.rightChild = right;
                stk.push(newNode2);
            }
            symbol = s.charAt(++i);
        }
        this.root = stk.pop();
    }

    public void postOrderTraverse(Node localRoot)
    {
        if(localRoot != null)
        { 
            postOrderTraverse(localRoot.leftChild);
            postOrderTraverse(localRoot.rightChild);
            localRoot.displayNode();
        }
    }
    public void preorderTraverse(Node localRoot)
    {
        if(localRoot != null)
        {
            localRoot.displayNode();
            preorderTraverse(localRoot.leftChild);
            preorderTraverse(localRoot.rightChild);
        }
    }

    public void inOrderTraverse(Node localRoot)
    {
        if(localRoot != null)
        {
            inOrderTraverse(localRoot.leftChild);
            localRoot.displayNode();
            inOrderTraverse(localRoot.rightChild);
        }
    }

     public void levelOrderTraversal(Node localRoot) 
     {

        if (localRoot == null)
        {
            System.out.println("Ağaç boş.");
            return;
        }

        Queue<Node> queue = new LinkedList<>();

        queue.add(localRoot);

        while (!queue.isEmpty()) 
        {
            Node current = queue.poll();
            current.displayNode(); 

            if (current.leftChild != null)
            {
                queue.add(current.leftChild);
            }

            if (current.rightChild != null)
            {
                queue.add(current.rightChild);
            }

        }

    }
}
