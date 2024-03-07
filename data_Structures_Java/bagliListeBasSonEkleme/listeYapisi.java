package data_Structures_Java.bagliListeBasSonEkleme;

public class listeYapisi {

    node head = null;
     
    node tail = null; 
    



    void basaekle(int x)
    {
        node eleman = new node();

        eleman.data = x;

        eleman.next = null; 

        if(head == null)
        {

            head = eleman;   

            tail = eleman;

            System.out.println("liste yapısı oluştu ilk eleman eklendi : "+ x);
        }

        else
        {
            eleman.next = head;

            head = eleman;

            System.out.println("başa eleman eklendi : "+ x);
            
        }


    }

    void sonaEkle(int x)
    {
        node eleman = new node();

        eleman.data = x;

        eleman.next = null; 

        if(head == null)
        {
           
            head = eleman; 

            tail = eleman;

            System.out.println("liste yapısı oluştu ilk eleman eklendi : "+ x);
        }

        else
        {
         
            tail.next = eleman; 

            tail = eleman; 
            
            System.out.println("sona eleman eklendi : "+ x);
        }


    }



    void yazdir()
    {
        if(head == null)
        {
            System.out.println("liste boştur");
        }

        else
        {
            node temp = head;
            while(temp!=null)
            {
                System.out.println(temp.data);

                temp = temp.next;
            }

        }
    }

}
