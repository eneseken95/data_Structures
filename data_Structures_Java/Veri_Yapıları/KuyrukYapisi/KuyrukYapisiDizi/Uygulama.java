package Veri_Yapıları.KuyrukYapisi.KuyrukYapisiDizi;

/**
 * Uygulama
 */
public class Uygulama {

    public static void main(String[] args) {
        
        QueueYapisi kuyruk = new QueueYapisi(5);

        kuyruk.enQueue(10);
        kuyruk.enQueue(20);
        kuyruk.enQueue(30);
        kuyruk.enQueue(40);
        kuyruk.enQueue(50);
        kuyruk.enQueue(60);

        kuyruk.elemanSayisi();
       
        kuyruk.yazdir();

        System.out.println();

        kuyruk.sondanYazdir();
    }
}