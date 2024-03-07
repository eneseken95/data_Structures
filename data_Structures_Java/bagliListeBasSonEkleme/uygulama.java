package data_Structures_Java.bagliListeBasSonEkleme;

public class uygulama {

    

   public static void main(String[] args)
   {

    listeYapisi tekYonlist = new listeYapisi();

    

    tekYonlist.basaekle(10);

    tekYonlist.basaekle(5);

    tekYonlist.basaekle(3);

    tekYonlist.sonaEkle(20);

    tekYonlist.sonaEkle(30);

    tekYonlist.basaekle(8);

    tekYonlist.sonaEkle(55);


    System.out.println("Baştaki nesne nin değeri : "+ tekYonlist.head.data);

    System.out.println("Sondaki nesne nin değeri : "+ tekYonlist.tail.data);

    System.out.println();


    System.out.println();


    tekYonlist.yazdir();


   }
    
}
