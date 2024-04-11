package Veri_Yapıları.Palindrom_Kelime_Uygulaması;

public class StackYapisi {

    Node top;
    int size;
    int cnt;
    public StackYapisi(int size) {
        this.size = size;
        cnt = 0;
        top = null;
    }

    void push(char ch)
    {
        if(!isFull())
        {
            Node eleman = new Node(ch);
            eleman.next = null;
            if(isEmpty())
            {
                top = eleman;
            }
            else
            {
                eleman.next = top;
                top = eleman;
            }
            cnt++;
        }
    }

    char pop()
    {
        if(!isEmpty())
        {
            char harf = top.harf;
            top = top.next;
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
