package Veri_Yapıları.YığınYapısı;

/**
 * Uygulama
 */
public class Uygulama {

    public static void main(String[] args) {
        
        StackYigin liste = new StackYigin(5);
    
        liste.push(1);
        liste.push(2);
        liste.push(3);
        liste.push(4);
        liste.push(5);
        liste.push(6);

        System.out.println("Çıkan : " + liste.pop());
      

    }
}