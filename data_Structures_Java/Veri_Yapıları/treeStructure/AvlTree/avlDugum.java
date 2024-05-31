package Veri_Yapıları.treeStructure.AvlTree;

public class avlDugum {
    public int veri;
    public int yukseklik;
    public avlDugum sol;
    public avlDugum sag;

    public avlDugum(int deger)
    {
        this.veri=deger;
        this.yukseklik=1;
        this.sol=null;
        this.sag=null;
    }


    public void yazdir(avlDugum root)
     {
        if (root != null) 
        {
            yazdir(root.sol);
            System.out.print(root.veri + " ");
            yazdir(root.sag);
        }
    }

    private int yukseklik(avlDugum N) 
    {
        if (N == null)
            return 0;

        return N.yukseklik;
    }


    public void yazdirYapısal(avlDugum root) 
    {
        int h = yukseklik(root);
        for (int i = 1; i <= h; i++) 
        {
            yazdirSeviye(root, i);
            System.out.println();
        }
    }


    private void yazdirSeviye(avlDugum root, int seviye) 
    {
        if (root == null)
        {
            System.out.print(" ");
            return;
        }

        if (seviye == 1)
        {
            System.out.print(root.veri + " ");
        }
        
        else if (seviye > 1) 
        {
            yazdirSeviye(root.sol, seviye - 1);
            yazdirSeviye(root.sag, seviye - 1);
        }
    }

}
