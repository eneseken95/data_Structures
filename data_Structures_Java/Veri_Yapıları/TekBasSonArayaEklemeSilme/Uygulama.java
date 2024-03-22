package Veri_Yapıları.TekBasSonArayaEklemeSilme;

public class Uygulama {

   public static void main(String[] args) {
    
    TekYonListeYapisi liste = new TekYonListeYapisi();

    liste.basaEkle(11);
    liste.sonaEkle(22);
    liste.basaEkle(5);
    liste.sonaEkle(33);
    liste.sonaEkle(44);
    liste.sonaEkle(55);
    liste.arayaEkle(2, 10);
    liste.arayaEkle(4, 20);
    liste.arayaEkle(3, 15);
    liste.Sil(6, 33);
    liste.Sil(1, 11);
    liste.Sil(2, 15);
    liste.arayaEkle(2, 4);
    liste.arayaEkle(5, 1);
    liste.arayaEkle(4, 15);
    liste.Sil(2, 4);
    liste.Sil(1, 10);
    liste.Sil(5, 22);
    liste.Sil(1, 5);

    
   
   
    System.out.println("listenin başındaki eleman : " + liste.head.data);
    System.out.println("listenin sonundaki eleman : " + liste.tail.data);

    liste.yazdir();

   }
    
}
