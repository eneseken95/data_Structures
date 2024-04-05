package Veri_Yapıları.KuyrukYapisi;

public class oncelikKuyruk 
{
    private kuyrukDugum on;
    private kuyrukDugum arka;
    
    
    public oncelikKuyruk()
    {
        this.on = this.arka = null;
    }

    public boolean bosmu() 
    {
        if(this.on==null)return true;

        else return false;
    }

    public int cikart()
     {

        if(this.bosmu())
        {
            return -1;
        }

        int veri=this.on.eleman;
        
        if(this.on.sonraki==null)
        {
            this.arka=null;
        }

        this.on=this.on.sonraki;

        return veri;
    }

    public void ekle(int eleman, int oncelik)
    {
        kuyrukDugum yeni=new kuyrukDugum(eleman,oncelik);

        if(this.bosmu())
        {
            this.on=yeni;
            this.arka=yeni;
            return;
        }
        
        if(yeni.oncelik<this.on.oncelik)
        {
            yeni.sonraki=this.on;
            this.on=yeni;
            System.out.println("Test1");
            return;
        }

        if(yeni.oncelik>=this.arka.oncelik)
        {
            this.arka.sonraki=yeni;
            this.arka=yeni;
            System.out.println("Test2");
            return;
        }

        kuyrukDugum temp=this.on;

        while(temp.sonraki!=null)
        {
            if(yeni.oncelik<temp.sonraki.oncelik)
            {
                yeni.sonraki=temp.sonraki;
                temp.sonraki=yeni;
                System.out.println("Test3");
                return;
            }
        
            else
            {
                temp=temp.sonraki;
            }
        }
}
    public void listele()
    {

        kuyrukDugum temp=this.on;

        if(temp==null)
        {
            System.out.println("Liste boş");
            return;
        }
        
        System.out.println("Liste elemanları");

        while(temp!=null)
        {
            temp.yazdir();
            temp=temp.sonraki;
        }
        
    }
}

    
    

