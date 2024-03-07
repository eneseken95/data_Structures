package data_Structures_Java.bagliListe;

public class listeyapisi {
    

    node ilknesne = null;
    
    node sonnesne = null;


    void ekle(int x )
    {
        node eleman = new node();

        eleman.data = x;

        eleman.next = null; 

        if(ilknesne == null)
        {
            ilknesne= eleman; 

            sonnesne = eleman;  

            System.out.println("liste oluşturuldu ve ilk nesne eklendi " + x);
        }



        else
        {
            sonnesne.next = eleman; 

            sonnesne = eleman; 

            System.out.println("listenin sonuna yeni bir eleman eklendi " + x);
        }
    }
    void yazdir()
    {
        if(ilknesne == null)
        {
            System.out.println("liste boştur");
        }

        else
        {
            node temp = ilknesne;
            while(temp!=null)
            {
                System.out.println(temp.data);

                temp = temp.next;
            }

        }
    }
    

}