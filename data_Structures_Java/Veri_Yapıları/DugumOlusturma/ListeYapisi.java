package Veri_Yapıları.DugumOlusturma;

public class ListeYapisi {

    Node head = null;
    Node tail = null;

    public void ekle(int x)
    {
        Node eleman = new Node();
        eleman.next = null;
        eleman.data = x;


        if(head == null)
        {
            head = eleman;
            tail = eleman;

            System.out.println("Liste oluşturuldu ve ilk düğüm eklendi");
        }

        else
        {
            tail.next = eleman;
            tail = eleman;

            System.out.println("Listenin sonuna yeni bir eleman eklendi");
        }
    }


    public void yazdir()
   {
        if(head == null)
        {
            System.out.println("liste boştur");
        }

        else
        {
            Node temp = head;

            System.out.println("liste başı");

            while(temp != null)
            {
                System.out.println(temp.data);
                
                temp = temp.next;
            }

            System.out.println("liste sonu");

        }
   } 
    
}
