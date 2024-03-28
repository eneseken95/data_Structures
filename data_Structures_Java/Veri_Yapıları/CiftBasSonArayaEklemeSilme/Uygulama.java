package Veri_Yapıları.CiftBasSonArayaEklemeSilme;


public class Uygulama {

    public static void main(String[] args) {
        
        CiftBagliListe liste = new CiftBagliListe();

        /*liste.basaEkle(10);
        liste.sonaEkle(20);
        liste.basaEkle(25);
        liste.sonaEkle(5);
        liste.sonaEkle(50);
        liste.sonaEkle(40);

        liste.arayaEkle(2, 30);
        liste.arayaEkle(7, 1);
        liste.arayaEkle(5, 4);
        liste.arayaEkle(9, 2);
        liste.arayaEkle(2, 1);
        liste.sonaEkle(25);
        liste.Sil(12, 25);
        liste.Sil(3, 30);
        liste.Sil(1, 25);*/



        liste.siraylaEkle(2);
        liste.siraylaEkle(5);
        liste.siraylaEkle(3);
        liste.siraylaEkle(8);

        liste.yazdir();
        

        System.out.println();
        System.out.println();


        liste.sondanYazdir();


        System.out.println();
        System.out.println();


        liste.elemanSayisi();


        System.out.println();
        System.out.println();

        
        System.out.println("Bulunan eleman : " + liste.elemanBul(20).data);

        

    }
}