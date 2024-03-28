package Veri_Yapıları.TekBasSonArayaEklemeSilme;


public class TekYonListeYapisi {

    Node head;
    Node tail;

    public TekYonListeYapisi() 
    {
        this.head = null;
        this.tail = null;
    }


    public void siraylaEkle(int data)
    {
        Node eleman = new Node();
        eleman.data = data;
        
        if(head == null)
        {
            head = eleman;
            tail = eleman;
        }

        else if(head.next == null)
        {
            if(eleman.data < head.data)
            {
                eleman.next = head;
                head = eleman;
            }

            else
            {
               tail.next = eleman;
               tail = eleman;
            }

        }

        else
        {
            Node temp = head;

            if(eleman.data < head.data)
            {
                eleman.next = head;
                head = eleman;
            }

            else if(tail.data < eleman.data)
            {
                tail.next = eleman;
                tail = eleman;
            }

            else
            {
                while(temp != null)
                {
                    
                    
                    if(eleman.data < temp.next.data)
                    {

                        eleman.next = temp.next;
                        temp.next = eleman;
                        break;
                    
                    }

                    temp = temp.next;
                    

                }
            }
            
        }


    }


    public void basaEkle(int x)
    {
        Node eleman = new Node();
        eleman.next = null;
        eleman.data = x;

        if(head == null)
        {
            head = eleman;
            tail = eleman;

            System.out.println("Liste yapısı oluştu ve ilk eleman eklendi");
        }
        
        else
        { 
            eleman.next = head;
            head = eleman;
            System.out.println("Liste nin başına eleman eklendi");
        }

    }

    public void sonaEkle(int x)
    {
        Node eleman = new Node();
        eleman.next = null;
        eleman.data = x;
        

        if(head == null)
        {
            head = eleman;
            tail = eleman;

            System.out.println("Liste yapısı oluştu ve ilk eleman eklendi");
        }

        else
        {
            Node temp = head;

            while(temp.next != null)
            {
                temp = temp.next;
            }

            temp.next = eleman;
            tail = eleman;

            System.out.println("Liste nin sonuna eleman eklendi");
        }
    }

    public void arayaEkle(int indis , int x)
    {
        Node eleman = new Node();
        eleman.next = null;
        eleman.data = x;
    

        if(head == null || indis == 0) 
        {
            head = eleman;
            tail = eleman;

            System.out.println("Liste yapısı oluştu ve ilk eleman eklendi");

        }
    
         else

            {
                Node temp = head;
                Node temp2 = head;
                temp = head;
                temp2 = head;

                int i=1;
                while(i < indis) 
                {
                    temp2 = temp;
                    temp = temp.next;
                    i++;
                }
                temp2.next = eleman;
                eleman.next = temp;

                System.out.println(indis + " İndisinci sıraya yeni eleman eklendi");

            }


        }


        public void Sil(int indis , int deger)
        {
            Node eleman = new Node();
            eleman.next = null;

            if(head == null)
            {
               head = eleman;
               tail = eleman;
            }

            else if(head.data == deger)
            {
                head = head.next;
            }

            else
            {
                int a = 1;
                Node temp = head;
                Node temp2 = head;

                while(a != indis)  
                {
                   
                    temp2 = temp;
                    temp = temp.next;
                    a++;
                }

                 if(temp.data == deger)
                {
                    temp2.next = temp.next;
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

    
}
