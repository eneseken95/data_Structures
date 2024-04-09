package Veri_Yapıları.KuyrukYapisi.KuyrukYapisiDizi;

public class QueueYapisi {

    int dizi[];
    int size;
    int front;
    int rear;
    int sayi;
    int a;

    public QueueYapisi(int size) {
        this.size = size;
        dizi = new int[size];
        front = 0;
        rear = -1;
    }


    public void enQueue(int data)
    {

        if(isFull())
        {
            System.out.println("Kuyruk doludur");
        }

        else
        {
            rear++;
            dizi[rear] = data;
            System.out.println("Kuyruga eklenen : " + dizi[rear]);
        }
    }

    public void deEnQueue()
    {

        if(isEmpty())
        {
            System.out.println("Kuyruk boş çıkarılacak eleman yok");
        }

        else
        {
            sayi = dizi[front];
        
            for(int i=1; i <= rear; i++)
            {
                 dizi[i-1] = dizi[i];
            }
            rear--;

            System.out.println("Kuyruk tan cikartilan : " + sayi);

        }
    }


    public boolean isFull()
    {
        return rear == size-1;
    }

    public boolean isEmpty()
    {
        return rear == -1;
    }


    public void elemanSayisi()
    {
        System.out.println(rear+1);
    }

    public void yazdir()
    {
       for(a=0; a <= size-1; a++)
       {
          System.out.println(dizi[a]);
       }
    }

    public void sondanYazdir()
    {
        for(a = size-1; a>=0; a--)
        {
            System.out.println(dizi[a]);
        }
    }

}
