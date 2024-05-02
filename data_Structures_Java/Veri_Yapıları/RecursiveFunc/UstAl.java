package Veri_Yapıları.RecursiveFunc;

public class UstAl {

    public static int F(int m, int y)
    {
        
        if(y==0)
        {
            return 1;
        }

        else if(y % 2 == 0)
        {
            return F(m, y/2) * F(m, y/2);
        }

        else
        {
            return m * F(m, y-1);
        }
    }



    public static void main(String[] args) {
        
        System.out.println(F(2, 6));

    }
    
}
