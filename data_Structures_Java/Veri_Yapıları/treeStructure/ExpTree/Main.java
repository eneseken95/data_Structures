package Veri_Yapıları.treeStructure.ExpTree;

public class Main {
    public static void main(String[] args) {
        
       expTree expT = new expTree();

       expT.createExpTree("23*84/+");


       System.out.println("Postfix İfade : 23*84/+");

       System.out.println();

       System.out.print("PreOrder: ");
       expT.preorderTraverse(expT.root);
       System.out.println();
       System.out.println();

       System.out.print("İnOrder: ");
       expT.inOrderTraverse(expT.root);
       System.out.println();
       System.out.println();

       System.out.print("PostOrder: ");
       expT.postOrderTraverse(expT.root);
       System.out.println();
       System.out.println();

       System.out.print("LevelOrder: ");
       expT.levelOrderTraversal(expT.root);

    }
}
