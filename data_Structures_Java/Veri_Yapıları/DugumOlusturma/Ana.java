package Veri_Yapıları.DugumOlusturma;


public class Ana {


    public static void main(String[] args) {


        Sinif A = new Sinif();

        Sinif B = new Sinif();

        Sinif C = new Sinif();

        A.sayi = 10;
        B.sayi = 20;
        C.sayi = 30;

        System.out.println(A.sayi);
        System.out.println(B.sayi);
        System.out.println(C.sayi);


        A.next = B;
        B.next = C;
        C.next = null;  


        Sinif temp = A;

       

        while(temp != null) 
        {
            System.out.println(temp.sayi);
            temp = temp.next;
        }


        
    }
    
}
