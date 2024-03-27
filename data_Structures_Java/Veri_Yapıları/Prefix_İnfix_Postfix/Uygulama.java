package Veri_Yapıları.Prefix_İnfix_Postfix;

import java.util.Stack;

// İnfix -> Posfix

public class Uygulama 
{

    public static int oncelik(char c)
    {
        switch(c)
        {
            case '+':
            case '-':
                return 1;

            case '*':
            case '/':
                return 2;

            case '^':
                return 3;
        }
        return -1;
    }


    public static String inFixPosFix(String inFixIfade)
    {
        Stack <Character> y = new Stack<>();
        String posIfade = "";

        for(int i=0; i<inFixIfade.length();i++)
        {
            char c =inFixIfade.charAt(i);
            System.out.println(c);

            if(oncelik(c)>0)
            {
                while((!y.isEmpty()) && (oncelik(y.peek()) >= oncelik(c)))
                {
                    posIfade = posIfade + y.pop();
                }
                y.push(c);
            }
            else
            {
                posIfade = posIfade + c;
            }
            System.out.println(posIfade);
        }

        int yiginBoyut = y.size();

        for(int i=0; i < yiginBoyut; i++)
        {
            posIfade = posIfade + y.pop();
            System.out.println("---->" + posIfade);
        }
        return posIfade;

        
    }

    public static int postfixHesapla(String postIfade)
    {
        String [] posfixDizi = postIfade.split(" ");
        Stack <String> y = new Stack<>();
        String e;
        int s1=0 , s2=0 , s3=0;

        for(int i=0;i<posfixDizi.length; i++)
        {
            e = posfixDizi[i];
            System.out.println("--->" + e + "<----");

            if(e.equals(""))
                continue;

            if(e.equals("+"))
            {
                s2 = Integer.parseInt(y.pop());
                s1 = Integer.parseInt(y.pop());
                s3 = s1 + s2;
                
                y.push(String.valueOf(s3));
            }

            else if(e.equals("-"))
            {

                s2 = Integer.parseInt(y.pop());
                s1 = Integer.parseInt(y.pop());
                s3 = s1 - s2;

                y.push(String.valueOf(s3));

            }

            else if(e.equals("*"))
            {

                s2 = Integer.parseInt(y.pop());
                s1 = Integer.parseInt(y.pop());
                s3 = s1 * s2;

                y.push(String.valueOf(s3));

            }

            else if(e.equals("/"))
            {

                s2 = Integer.parseInt(y.pop());
                s1 = Integer.parseInt(y.pop());
                s3 = s1 / s2;

                y.push(String.valueOf(s3));

            }

            else
            {
                y.push(e);
            }
            
        }
        int sonuc = Integer.parseInt(y.pop());

        if(!y.isEmpty())
        {
            System.out.println("Posifix ifade hatali");
            return 0;
        }
        return sonuc;
    }
    


    public static void main(String[] args)
    {

    String posfixIfade = "6 6 3 * + 10 -";
    System.out.println(postfixHesapla(posfixIfade));

    }
    
}
