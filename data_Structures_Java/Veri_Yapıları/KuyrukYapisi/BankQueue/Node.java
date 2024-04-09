package Veri_Yapıları.KuyrukYapisi.BankQueue;

public class Node {

    int data;
    Node next;
    String oncelik;

    public Node(int data , String oncelik)
    {
        this.data = data;
        this.oncelik = oncelik;
        next = null;

        
    }


   public int oncelikler(String oncelik)
   {
        switch(oncelik)
        { 
            case "Kredi Cekme":
                return 1;

            case "Havale":
            case "Para Cekme":
                return 2;
            
            case "Fatura Odeme":
                return 3;

            default:
            return 0;
        }
        

   }
    
    
}
