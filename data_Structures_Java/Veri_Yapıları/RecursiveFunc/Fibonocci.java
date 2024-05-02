package Veri_Yapıları.RecursiveFunc;

public class Fibonocci {


    public static int recFib(int n)
    {
        int sonuc;
        if(n == 1 || n == 2)
        return 1;
        
       else
       {
        sonuc = recFib(n-1) + recFib(n-2);
        return sonuc;
       }
   

        
    }
    
    public static void main(String[] args) {
        
        System.out.println(" fibonacci :" + recFib(6));
    }
}
