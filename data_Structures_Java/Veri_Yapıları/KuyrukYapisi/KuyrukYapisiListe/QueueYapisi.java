package Veri_Yapıları.KuyrukYapisi.KuyrukYapisiListe;

/**
 * QueueYapisi
 */
public class QueueYapisi {

    Node front;
    Node rear;
    int cnt;
    int size;
    int sayi;


    public QueueYapisi(int size)
    {
        this.size = size;
        cnt = 1;
        front = null;
        rear = null;
    }


    public void enQueue(int data)
    {
        if(isFull())
        {
            System.out.println("Kuyruk dolu ekleme yapılamaz");
        }
        
        else
        {
            Node eleman = new Node(data);
            eleman.next = null;

            if(front == null)
            {
                front = eleman;
                rear = eleman;
                System.out.println("kuyruk ilk eleman : " + front.data);
            }
            
            else
            {
                Node temp = front;

                while(temp.next != null)
                {
                    temp = temp.next;
                }

                temp.next = eleman;
                temp = eleman;
                cnt++;
                
                System.out.println("kuyruga eklenen eleman : " + eleman.data);
            }

        }
    }


    public void deEnqueu()
    {

        if(isEmpty())
        {
            System.out.println("Kuyruk bos cikarilma yapilamaz");
        }

        else
        {
             int sayi = front.data;
             front = front.next;
             cnt--;
             
             System.out.println("kuyruktan cikan eleman : " + sayi);
        }
    }



   public boolean isFull()
   {
        return cnt == size;
   }

   public boolean isEmpty()
    {
        return cnt == 0;
    }


    public void listele()
    {

        if(isEmpty())
        {
            System.out.println("kuyruk bos");
        }

        else
        {
            Node temp = front;

            while(temp != null)
            {
                System.out.println(temp.data);
                temp = temp.next;
            
            }
    
        }
       

    }
}