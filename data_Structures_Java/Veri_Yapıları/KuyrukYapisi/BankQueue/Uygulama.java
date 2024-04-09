package Veri_Yapıları.KuyrukYapisi.BankQueue;

public class Uygulama {


    public static void main(String[] args) {


        BankQueue kuyruk = new BankQueue();
        
        System.out.println("İslemler :");
        System.out.println();
        System.out.println("Kredi Cekme");
        System.out.println("Havale");
        System.out.println("Para Cekme");
        System.out.println("Fatura Odeme");

        System.out.println();

        kuyruk.siraylaEkle(10, "Kredi Cekme");
        kuyruk.siraylaEkle(50, "Fatura Odeme");
        kuyruk.siraylaEkle(100, "Havale");


        kuyruk.yazdir();


    }
    
}
