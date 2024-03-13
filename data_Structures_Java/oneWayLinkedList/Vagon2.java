package oneWayLinkedList;

public class Vagon2 
{
    public int veri;
    public Vagon2 SonrakiVagon;
    public Vagon2 BasVagon; 
    public Vagon2()
    {
        this.SonrakiVagon = null;
        this.BasVagon = null;
    }

    public void BasaVagonEkle(int deger)
    {
        Vagon2 YeniBasVagon = new Vagon2();

        YeniBasVagon.veri = deger;

        YeniBasVagon.SonrakiVagon = BasVagon;
        this.BasVagon = YeniBasVagon;
    }

    public void SonaVagonEkle(int deger)
    {
        Vagon2 YeniSonVagon = new Vagon2();

        YeniSonVagon.veri = deger;

        Vagon2 temp = this.BasVagon;

        if(temp == null)
        {
            temp = YeniSonVagon;
        }

        while(temp.SonrakiVagon != null) 
        {
            temp = temp.SonrakiVagon;
        }

        temp.SonrakiVagon = YeniSonVagon;

        
    }

    public void yazdir()
    {
        System.out.println(veri);
        System.out.println();
    }


    public void listele()
    {
        Vagon2 temp = this.BasVagon;

        if(temp == null)
        {
            System.out.println("Liste Boş");
        }

        while(temp != null) 
        {
            temp.yazdir();
            temp = temp.SonrakiVagon;
        }
    }

     public void ArayaVagonEkle(int deger, int index)
     {
        int sayac = 1;

        if(index == 1 || this.BasVagon == null)
        {
            this.BasaVagonEkle(deger);
        }

        else
        {
            Vagon2 ArayaVagon = new Vagon2();
            
            ArayaVagon.veri = deger;

            Vagon2 temp = this.BasVagon;

            while(temp.SonrakiVagon != null) 
            {
                if(sayac == index - 1)
                {
                    break;
                }
                
                else
                {
                    temp = temp.SonrakiVagon;
                    sayac++;
                }
            }
          
            Vagon2 temp2 = temp.SonrakiVagon;

            temp.SonrakiVagon = ArayaVagon;

            ArayaVagon.SonrakiVagon = temp2;

          }

        }


        public int VeriSil (int deger)
        {
            if(BasVagon == null)
            {
                return -1;
            }
            
            if(BasVagon.veri == deger)
            {
                BasVagon = BasVagon.SonrakiVagon;
                return 0;
            }

            Vagon2 temp = this.BasVagon;

            while(temp.SonrakiVagon.veri != deger)
            {
                if(temp.SonrakiVagon.SonrakiVagon == null)
                {
                    return -2;
                }
                temp = temp.SonrakiVagon;
            }
            
            temp.SonrakiVagon = temp.SonrakiVagon.SonrakiVagon;

            return 0;
        
       
        }

        public Vagon2 VeriBul(int deger)
        {
            Vagon2 temp = this.BasVagon;
            Vagon2 bulunanveri = null;

            while(temp != null)
            {
                if(temp.veri != deger)
                {
                    temp = temp.SonrakiVagon;
                }
                
                else
                {
                    bulunanveri = temp;
                    break;
                }
            }
            return bulunanveri;
            
        }

        public int listeElemanSayisi()
        {
            int sayac = 0;
            
            Vagon2 temp = this.BasVagon;

            while(temp != null)
            {
                sayac++;

                temp= temp.SonrakiVagon;
            }
            return sayac;
        }


    

    public static void main(String[] args)
    {

        Vagon2 listem = new Vagon2();

        listem.BasaVagonEkle(20);
        listem.SonaVagonEkle(30);

        listem.BasaVagonEkle(50);
        listem.SonaVagonEkle(10);

        listem.ArayaVagonEkle(100, 3);

        listem.VeriSil(30);
       

        if(listem.VeriBul(50) == null)
        {
            System.out.println("Veri Bulunamadı");
 
        }
        else
        {
            System.out.println("Veri Bulundu " + listem.VeriBul(50).veri);
        }

        System.out.println("Liste Nesne Saysısı : " + listem.listeElemanSayisi());
        
        listem.listele();

    }

}
