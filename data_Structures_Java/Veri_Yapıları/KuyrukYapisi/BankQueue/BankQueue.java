package Veri_Yapıları.KuyrukYapisi.BankQueue;

public class BankQueue {


    Node front;
    Node rear;

    public BankQueue()
    {
        front = null;
        rear = null;
    }


   public void siraylaEkle(int data , String oncelik)
   {

        Node eleman = new Node(data, oncelik);
        eleman.next = null;
         
        if(front == null)
        {
            front = eleman;
            rear = eleman;
            return;
        }

        if(eleman.oncelikler(eleman.oncelik) < front.oncelikler(front.oncelik))
        {
            eleman.next = front;
            front = eleman;
            return;
        }

        if(eleman.oncelikler(eleman.oncelik) >= rear.oncelikler(rear.oncelik))
        {
            rear.next = eleman;
            rear = eleman;
            return;
        }

        else
        {
            Node temp = front;

            while(temp.next != null)
            {
                if(eleman.oncelikler(eleman.oncelik) < temp.next.oncelikler(temp.next.oncelik))
                {
                    eleman.next = temp.next;
                    temp.next = eleman;
                    return;
                }

                else
                {
                    temp = temp.next;
                }
            }
        }


   }

   public void yazdir()
   {
        Node temp = front;

        while(temp != null)
        {
            System.out.println(temp.data);
            temp = temp.next;
        }
   }


}
