package Veri_Yapıları.treeStructure.BinarySearchTree;

import java.util.LinkedList;
import java.util.Queue;

public class ikiliAramaAgac {

    public ikiliAgacDugum kok; 

    public ikiliAramaAgac()
    {
        kok = null;
    }

    public void ekle(int deger)
    {
        ikiliAgacDugum yeni = new ikiliAgacDugum(deger);

        if(this.kok == null)
        {
            this.kok = yeni;
            System.out.println("Kök oluşturuldu: " + deger);
            System.out.println();
            return; 
        }

        ikiliAgacDugum parent = null;

        ikiliAgacDugum aktif = this.kok;


        while(true)
        {
            parent = aktif;
            
            if(deger < aktif.veri)
            {
                aktif = aktif.sol; 

                if(aktif == null)
                {
                    parent.sol = yeni;
                    System.out.println("Parent :" + parent.veri + "  |   sola eklenen :" + yeni.veri);
                    System.out.println();
                    return;
                }
            }

            else if(deger > aktif.veri)
            {
                aktif = aktif.sag;

                if(aktif == null)
                {
                    parent.sag = yeni;
                    System.out.println("Parent :" + parent.veri + "  |  sagina eklenen :" + yeni.veri);
                    System.out.println();
                    return;
                }
            }

            else 
            {
                System.out.println("Bu degerden var");
                System.out.println();
                return;
            }
        }
    }

    public ikiliAgacDugum minDugum()
    {
        if(this.kok == null)
        {
            return null;
        }

        ikiliAgacDugum aktif = this.kok;

        while(aktif.sol != null)
        {
            aktif = aktif.sol;
        }
        return aktif;
    }

    public ikiliAgacDugum maxDugum()
    {
        if(this.kok == null)
        {
            return null;
        }

        ikiliAgacDugum aktif = this.kok;

        while(aktif.sag != null)
        {
            aktif = aktif.sag;
        }
        return aktif;
    }


    public ikiliAgacDugum maxAtaDugum()
    {
        if(this.kok == null)
        {
            return null;
        }

        ikiliAgacDugum aktif = this.kok;
        ikiliAgacDugum ata = this.kok;

        while(aktif.sag != null)
        {
            ata = aktif;
            aktif = aktif.sag;
        }
        return ata;
    }


    public ikiliAgacDugum minAtaDugum()
    {
        if(this.kok == null)
        {
            return null;
        }

        ikiliAgacDugum aktif = this.kok;
        ikiliAgacDugum ata = this.kok;

        while(aktif.sol != null)
        {
            ata = aktif;
            aktif = aktif.sol;
        }
        return ata;
    }


    public ikiliAgacDugum minKardesDugum()
    {
        if(this.kok == null)
        {
            return null;
        }

        ikiliAgacDugum aktif = this.kok;
        ikiliAgacDugum minKardes = this.kok;

        while(aktif.sol != null)
        {
            minKardes = aktif;
            aktif = aktif.sol;
        }
        return minKardes.sag;
    }

    public ikiliAgacDugum maxKardesDugum()
    {
        if(this.kok == null)
        {
            return null;
        }

        ikiliAgacDugum aktif = this.kok;
        ikiliAgacDugum maxKardes = this.kok;

        while(aktif.sag != null)
        {
            maxKardes = aktif;
            aktif = aktif.sag;
        }
        return maxKardes.sol;
    }


    public void levelOrderTraversal(ikiliAgacDugum kokDugum) 
    {

        if (kokDugum == null)
        {
            System.out.println("Ağaç boş.");
            return;
        }

        Queue<ikiliAgacDugum> queue = new LinkedList<>();

        queue.add(kokDugum);

        while (!queue.isEmpty()) 
        {
            ikiliAgacDugum aktif = queue.poll();
            aktif.yazdir(); 

            if (aktif.sol != null)
            {
                queue.add(aktif.sol);
            }

            if (aktif.sag != null)
            {
                queue.add(aktif.sag);
            }

        }

    }


    public int yukseklik(ikiliAgacDugum dugum) 
    {
        if (dugum == null)
        {
            return 0;
        }

        return 1 + Math.max(yukseklik(dugum.sol), yukseklik(dugum.sag));
    }


    public int dengeFaktoru(ikiliAgacDugum dugum) 
    {
        if (dugum == null) 
        {
            return 0;
        }

        return yukseklik(dugum.sol) - yukseklik(dugum.sag);
    }


    public ikiliAgacDugum enBuyukDengeFaktoruDugumu(ikiliAgacDugum dugum) 
    {

        if (dugum == null) 
        {
            return null;
        }

        ikiliAgacDugum enBuyukDengeDugumu = dugum;
        
        int enBuyukFark = Math.abs(dengeFaktoru(dugum));

        ikiliAgacDugum solDengeDugumu = enBuyukDengeFaktoruDugumu(dugum.sol);
        ikiliAgacDugum sagDengeDugumu = enBuyukDengeFaktoruDugumu(dugum.sag);

        if (solDengeDugumu != null && Math.abs(dengeFaktoru(solDengeDugumu)) > enBuyukFark) 
        {
            enBuyukFark = Math.abs(dengeFaktoru(solDengeDugumu));
            enBuyukDengeDugumu = solDengeDugumu;
        }

        if (sagDengeDugumu != null && Math.abs(dengeFaktoru(sagDengeDugumu)) > enBuyukFark) 
        {
            enBuyukFark = Math.abs(dengeFaktoru(sagDengeDugumu));
            enBuyukDengeDugumu = sagDengeDugumu;
        }

        return enBuyukDengeDugumu;
    }


    public ikiliAgacDugum dugumBul(int deger)
    {
        if(this.kok == null)
        {
            return null;
        }

        ikiliAgacDugum aktif = this.kok;

        while(aktif != null)
        {
            if(aktif.veri == deger)
            {
                return aktif;
            }

            else if(deger < aktif.veri)
            {
                aktif =  aktif.sol;
            }
            
            else 
            {
                aktif = aktif.sag;
            }
        }

        return aktif;

    }

    public ikiliAgacDugum dugumSil(ikiliAgacDugum kokDugum, int deger)
    {
        if(kokDugum == null)
        {
            System.out.println("Silme basarisiz");
            System.out.println();
            return null;
        }

        if(deger < kokDugum.veri)
        {
            kokDugum.sol = dugumSil(kokDugum.sol, deger);
            return kokDugum;
        }

        else if(deger > kokDugum.veri)
        {
            kokDugum.sag = dugumSil(kokDugum.sag, deger);
            return kokDugum;
        }

        else 
        {
            if(kokDugum.sol != null && kokDugum.sag != null)
            {
                ikiliAgacDugum temp = this.minDugum();
                kokDugum.veri = temp.veri;

                kokDugum.sag = dugumSil(kokDugum.sag, temp.veri);
                System.out.println("Kontrol sol sag cocuk  |  silinen deger :"  + deger);
                System.out.println();
                return kokDugum;
            }

            else if(kokDugum.sol != null)
            {
                System.out.println("Kontrol tek sol cocuk  |  silinen deger :"  + deger);
                System.out.println();
                return kokDugum.sol;
            }
          

            else if(kokDugum.sag != null)
            {
                System.out.println("Kontrol tek sag cocuk  |  silinen deger :"  + deger);
                System.out.println();
                return kokDugum.sag;
            }

            
            else 
            {
                System.out.println("Kontrol yaprak |  silinen deger : " + deger);
                System.out.println();
                kokDugum = null;
                return null;
            }

        }
    }
}
