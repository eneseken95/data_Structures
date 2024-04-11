package Veri_Yapıları.Palindrom_Kelime_Uygulaması;

import java.util.Scanner;

/**
 * Uygulama
 */
public class Uygulama {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        StackYapisi st = new StackYapisi(100);
        QueueYapisi qu = new QueueYapisi(100);

        String kelime;
        System.out.println("kelime girin : ");
        kelime = scanner.nextLine();
        int n = kelime.length();

        char [] harfler = kelime.toCharArray();
        int i = 0;
        
        while(i<n)
        {
            st.push(harfler[i]);
            qu.enQueue(harfler[i]);
            i++;
        }

        boolean sonuc = true;

        while(!st.isEmpty())
        {
            if(st.pop() != qu.deQueue())
            {
                sonuc = false;
                break;
            }
        }

        if(sonuc)
        {
            System.out.println(kelime + "  polindromdur");
        }
        else
        {
            System.out.println(kelime + "  polindrom değildir");
        }

    }
}