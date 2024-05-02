package Veri_Yapıları.RecursiveFunc;

public class Faktoriyel {


     public static int F(int n)
    {
        if ( n == 1 ) 
        return( 1 );

        else
        return ( n * F( n - 1 ));
    } 



    public static void main(String[] args) {
        
    System.out.println("5 faktoriyel :" + F(5));

    }
}