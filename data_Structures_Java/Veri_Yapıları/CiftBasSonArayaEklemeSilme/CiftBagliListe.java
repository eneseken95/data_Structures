package Veri_Yapıları.CiftBasSonArayaEklemeSilme;


public class CiftBagliListe {
    
    Node head = null;
    Node tail = null;

    void basaEkle(int data)
    {
        Node eleman = new Node();
        eleman.next = null;
        eleman.data = data;

        if(head == null)
        {
            head = eleman;
            tail = eleman;
        }

        else
        {
            eleman.next = head;
            head.prev = eleman;
            head = eleman;

        }

     }

     void sonaEkle(int data)
    {
        Node eleman = new Node();
        eleman.next = null;
        eleman.data = data;

        if(head == null)
        {
            head = eleman;
            tail = eleman;
        }

        else
        {
           Node temp = head;

           while(temp.next != null)
           {
            temp = temp.next;
           }

          temp.next = eleman;
          eleman.prev = temp;
          temp = eleman;


        }

     }

     void arayaEkle(int indis , int data)
     {
         Node eleman = new Node();
         eleman.next = null;
         eleman.data = data;
 
         if(head == null)
         {
             head = eleman;
             tail = eleman;
         }
 
         else
         {
           Node temp = head;
           Node temp2 = head;
           int i = 1;
           while(i < indis)
           {
            temp2 = temp;
            temp = temp.next;
            i++;
           }
           temp2.next = eleman;
           eleman.prev = temp2;
           eleman.next = temp;
           temp.prev = eleman;
           
         }
 
      }

      public void Sil(int indis , int data)
      {
        Node eleman = new Node();
        eleman.next = null;
        eleman.data = data;

        if(head == null)
        {
            head = eleman;
            tail = eleman;
        }

        if(head.data == data && indis == 1) 
            {
                head = head.next; 
                head.prev = null;
            }


            Node temp3 = head;

            while(temp3.next != null)
            {
             temp3 = temp3.next;
            }

        if(temp3.data == data)
        {
            temp3 = temp3.prev;
            temp3.next = null;

        }
         
            
        else
        {

          Node temp = head;
          Node temp2 = head;

          int i = 1;

            while(i != indis)
            {
                temp2 = temp;
                temp = temp.next;
                i++;
            }

            if(temp.data == data)
            {
                temp2.next = temp.next;
                temp.next.prev = temp2;
            }           
            
        }

      }


     public void yazdir()
     {
        Node temp = head;

        while(temp != null)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
     }


     public void sondanYazdir()
     {
        Node temp = tail;

        while(temp != null)
        {
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
     }

     public void elemanSayisi()
     {
        Node temp = head;
        int sayac = 0;

        while(temp != null)
        {
            sayac++;
            temp = temp.next;
           
        }
        System.out.print("Liste eleman sayisi : " + sayac);
        
     }

     public Node elemanBul(int deger)
     {
        Node temp = head;
        Node bulunan = null;

        while(temp != null)
        {
            
            if(temp.data != deger)
            {
                temp = temp.next;
            }

            else 
            {
                bulunan = temp;
                break;
            }
        }
        return bulunan;
        
     }
}
