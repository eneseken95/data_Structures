package Veri_Yapıları.RecursiveFunc;

public class ExponentialNumber {

    static int count = 0;

    public static int F(int m, int y)
    {
        
        if(y==0)
        {
            return 1;
        }

        else if(y % 2 == 0)
        {
            count++;
            return F(m, y/2) * F(m, y/2);
        }

        else
        {
            count++;
            return m * F(m, y-1);
        }
    }



    public static void main(String[] args) {
        
        System.out.println(F(2, 6));
        System.out.println("Çarpma işlemi sayısı: " + count);

    }
    
}
