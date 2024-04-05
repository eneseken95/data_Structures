package Veri_Yapıları.KuyrukYapisi;

public class kuyrukDugum 
{
    public int eleman;
    public int oncelik;
    public kuyrukDugum sonraki;

    public kuyrukDugum(int e,int oncelik)
    {
        this.eleman = e;
        this.oncelik= oncelik;
        this.sonraki = null;
    }
    
    public void yazdir()
    {
         System.out.println(this.eleman+" "+this.oncelik);
    }
}
