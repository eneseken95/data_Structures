package Veri_Yapıları.YığınYapısı;

import java.util.Stack;

public class ReadyStack {


    public static void main(String[] args) {
        
    Stack <String> myString = new Stack <String>();

    String dersler[] = {"Veri yapıları", "Matematik", "Tarih", "Türk Dili"};

    for(int i=0 ; i < dersler.length ; i++)
    {
        myString.push(dersler[i]);
    }


    while(!myString.isEmpty())
    {
        System.out.println(myString.pop());
    }
 }
}
