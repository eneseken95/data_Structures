package Veri_Yapıları.Palindrom_Kelime_Uygulaması;

public class QueueYapisi {

    Node front;
    Node rear;
    int cnt;
    int size;

    public QueueYapisi(int size) {
        this.size = size;
        front = null;
        rear = null;
        cnt = 0;
    }

    void enQueue(char ch)
    {
        Node eleman = new Node(ch);
        eleman.next = null;

        if(!isFull())
        {
            if(isEmpty())
            {
                front = eleman;
                rear = eleman;
            }

            else
            {
                Node temp = front;

                while(temp.next != null)
                {
                    temp= temp.next;
                }
                temp.next = eleman;
                temp = eleman;
            }
            cnt++;
        }

    }

    char deQueue()
    {
        if(!isEmpty())
        {
            char harf = front.harf;
            front = front.next;
            cnt--;
            return harf;
        }
       else
       {
        return '-';
       }

    }

    boolean isEmpty()
    {
        return cnt == 0;
    }

    boolean isFull()
    {
        return cnt == size;
    }



    
    
}
