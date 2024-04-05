package Veri_Yapıları.KuyrukYapisi;

/**
 * Uygulama
 */
public class Uygulama {

    public static void main(String[] args) 
    {
  
        oncelikKuyruk k = new oncelikKuyruk();
    
        k.ekle(10, 1);
        k.ekle (20,1);
        k.ekle(30, 2);
        k.ekle(40,1);
        k.ekle(50, 2);
        k.ekle(60, 3);
        k.ekle(70, 2);
        k.listele();

    }
    
}

