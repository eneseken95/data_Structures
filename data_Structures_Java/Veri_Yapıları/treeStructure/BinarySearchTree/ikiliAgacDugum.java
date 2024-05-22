package Veri_Yapıları.treeStructure.BinarySearchTree;

/**
 * ikiliAgacDugum
 */
public class ikiliAgacDugum {

    public int veri;
    public ikiliAgacDugum sol;
    public ikiliAgacDugum sag; 

    public ikiliAgacDugum(int deger)
    {
        veri = deger;
        sol = null;
        sag = null;
    }

    public void yazdir()
    {
        System.out.print(this.veri + " ");
    }
    
}