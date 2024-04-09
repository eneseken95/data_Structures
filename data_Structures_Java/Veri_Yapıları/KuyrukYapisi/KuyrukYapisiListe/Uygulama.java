package Veri_Yapıları.KuyrukYapisi.KuyrukYapisiListe;

public class Uygulama {

    public static void main(String[] args) {
        
        QueueYapisi kuyruk = new QueueYapisi(3);
      

        kuyruk.enQueue(10);
        kuyruk.enQueue(15);
        kuyruk.enQueue(20);
        kuyruk.enQueue(25);
    
        kuyruk.deEnqueu();
        kuyruk.deEnqueu();
        kuyruk.deEnqueu();
        kuyruk.deEnqueu();


        System.out.println();

        kuyruk.listele();

        System.out.println("ilk eleman : " + kuyruk.front.data);



        
        
    }
    
}
