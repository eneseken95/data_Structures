package Veri_Yapıları.treeStructure.BinarySearchTree;

public class uygulama {

    public static void main(String[] args) {
        
        ikiliAramaAgac bst = new ikiliAramaAgac();

        bst.ekle(10);
        bst.ekle(5);
        bst.ekle(8);
        bst.ekle(20);
        bst.ekle(3);
        bst.ekle(28);
        bst.ekle(17);

        // Daha büyük denge farkı oluşturacak eklemeler

        bst.ekle(30); 
        bst.ekle(25); 
        bst.ekle(35); 
        bst.ekle(1);  
        bst.ekle(0);

        ikiliAgacDugum enKucuk = bst.minDugum();

        System.out.print("Agacin en kucuk degeri :  ");
        enKucuk.yazdir();
        System.out.println();

        ikiliAgacDugum enBuyuk = bst.maxDugum();

        System.out.print("Agacin en buyuk degeri :  ");
        enBuyuk.yazdir();
        System.out.println();


        int aranan = 15;

        ikiliAgacDugum bulunan = bst.dugumBul(aranan);
        
        if(bulunan != null)
        {
            bulunan.yazdir();
        }
        
        else
        {   System.out.println();
            System.out.println(aranan + "  degeri agacta yoktur");
        }


        System.out.println();


        int silinecek = 9;

        bst.dugumSil(bst.kok,silinecek);

        System.out.println();

        System.out.print("Max dugumun atası:   ");

        ikiliAgacDugum maxAta = bst.maxAtaDugum();

        maxAta.yazdir();

        System.out.println();

        System.out.print("Min dugumun atası:   ");

        ikiliAgacDugum minAta = bst.minAtaDugum();

        minAta.yazdir();

        System.out.println();
        System.out.println();

        System.out.print("Min kardes:   ");

        ikiliAgacDugum minKardes = bst.minKardesDugum();

        if(minKardes != null)
        {
            minKardes.yazdir();
        }
        
        else
        {
            System.out.println("Min kardes yok");
        }

        System.out.print("Max kardes:   ");

        ikiliAgacDugum maxKardes = bst.maxKardesDugum();


        if(maxKardes != null)
        {
            maxKardes.yazdir();
        }
        
        else
        {
            System.out.println("Max kardes yok");
        }

        System.out.println();
        System.out.println();

        System.out.print("LevelOrderTraversal: ");
        bst.levelOrderTraversal(bst.kok);
       
        System.out.println();
        System.out.println();

        System.out.print("Agac da denge farkının en cok oldugu dugum:  ");

        ikiliAgacDugum enBuyukFark = bst.enBuyukDengeFaktoruDugumu(bst.kok);
        
        if (enBuyukFark != null) 
        {
            enBuyukFark.yazdir();
        } 

        else 
        {
            System.out.println("En büyük denge farkı olan düğüm bulunamadı.");
        }

    }
    
}
