package Veri_Yapıları.YığınYapısı;

public class StackYigin2 {

    int size;
    int cnt;
    Node top;

    public StackYigin2(int size) {
        this.size = size;
        cnt = 0;
        top = null;
    }

    void push(int data)
    {
        Node eleman = new Node(data);

        if(isFull())
        {
            System.out.println("Stack dolu , ekleme yapılamaz");
        }
        else
        {
            if(isEmpty())
            {
                top = eleman;
                System.out.println(top.data + "Stack e ilk eleman eklendi");
            }

            else
            {
                eleman.next = top;
                top = eleman;
                System.out.println(top.data + "Stack e eklendi");
            }
            cnt++;

         
        }

    }
    
    void pop()
    {
        if(isEmpty())
        {
            System.out.println("Stack boş çıkartılacak eleman yok");
        }
        else
        {
            System.out.println(top.data + "En yukarıdaki eleman listeden çıkartıldı");
            top = top.next;
            cnt--;
            
        }


    }

    public void print()
    {
        if(isEmpty())
        {
            System.out.println("Stack boş");
        }

        else
        {
            Node temp = top;

            while(top != null)
            {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }


    }

    public void top()
    {
        if(isEmpty())
        {
            System.out.println("Stack boş");
        }
        
        else
        {
            System.out.println("Üstteki düğümün datası : " + top.data);
        }
    }

    boolean isFull()
    {
        return cnt == size;
    }

    boolean isEmpty()
    {
        return cnt == 0;
    }
    
}
