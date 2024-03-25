package Veri_Yapıları.YığınYapısı;

public class Uygulama2 {

  public static void main(String[] args) {
    
    StackYigin2 liste = new StackYigin2(10);

    liste.push(10);
    liste.push(20);
    liste.push(30);
    
    liste.pop();

    liste.top();

    liste.print();

  }

}
