package Veri_Yapıları.YığınYapısı;

/**
 * StackYigin
 */
public class StackYigin {

    int dizi[];
    int size;
    int indis;
    public StackYigin(int size) {
        this.size = size;
        dizi = new int[size];
        indis = -1;
    }

  

    public void push(int data)
    {

        if(isFull())
        {
            System.out.println("Stack dolu");
        }

        else
        {
            indis++;
            dizi[indis] = data;
            System.out.println("Eklenen : " + dizi[indis]);
        }

    }

    public int pop()
    {
        if(isEmpty())
        {
            System.out.println("Dizi boş");
            return -1;

        }
        else
        {
           
            indis--;
            return dizi[indis];
        }
        
        
    }

    boolean isFull()
    {
        return indis == size - 1;
    }

    boolean isEmpty()
    {
        return indis == -1;
    }
    
}