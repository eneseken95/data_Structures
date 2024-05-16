package Veri_Yapıları.RecursiveFunc;

public class FibRecİtera {

   static int recCount = 0;
   static int iterCount = 0;


    public static int recFib(int n) 
    {
        if (n == 1 || n == 2)
            return 1;

        else
        {   
            recCount++;
            return recFib(n - 1) + recFib(n - 2);
        }
       
    }

    public static int iterativeFib(int n) 
    {

        if (n <= 1)
            return n;

        else
        {
            int fib1 = 0, fib2 = 1, fib = 1;
            for (int i = 2; i <= n; i++) 
            {
                fib = fib1 + fib2;
                fib1 = fib2;
                fib2 = fib;
                iterCount++;
            }
    
            return fib;
        }

    }

    public static void main(String[] args) {
        int n = 6;

        System.out.println("Recursive Fibonacci: " + recFib(n));
        System.out.println("Iterative Fibonacci: " + iterativeFib(n));

        System.out.println();

        System.out.println("Recursive Count: " + recCount);
        System.out.println("Iterative Count: " + iterCount);

       
    }
}
