package Veri_Yapıları.treeStructure.AvlTree;

public class App {
    public static void main(String[] args) throws Exception {
        
        avlAgac avlTree = new avlAgac();
        avlDugum root = null;

        root = avlTree.ekle(root, 10);
        root = avlTree.ekle(root, 20);
        root = avlTree.ekle(root, 30);
        root = avlTree.ekle(root, 40);
        root = avlTree.ekle(root, 50);
        root = avlTree.ekle(root, 25);


        System.out.print("AVL tree in-order traversal: ");
        root.yazdir(root);

        System.out.println();

        System.out.println("AVL tree (yapısal): ");
        root.yazdirYapısal(root);

    }
    
}
