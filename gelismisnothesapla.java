import java.util.Scanner;



public class gelismisnothesapla {
    public static void main(String[] args) {
        int vize1,vize2,finall;
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen İlk Vizenizi Giriniz");
        vize1 = scan.nextInt();
        System.out.println("Lutfen İkinci Vizenizi Giriniz");
        vize2 = scan.nextInt();
        System.out.println("Lutfen Finalinizi Giriniz");
        finall = scan.nextInt();
        int toplam =  (vize1*30/100) + (vize2*30/100) + (finall*40/100);

        System.out.println("Notunuz = " + toplam);

        if(toplam >= 90)
        {
            System.out.println("Harf Notunuz : AA");
        }
        else if(toplam >= 85)
        {
            System.out.println("Harf Notunuz : BA");
        }
        else if(toplam >= 80)
        {
            System.out.println("Harf Notunuz : BB");
        }
        else if(toplam >= 75)
        {
            System.out.println("Harf Notunuz : CB");
        }
        else if(toplam >= 70)
        {
            System.out.println("Harf Notunuz : CC");
        }
        else if(toplam >= 65)
        {
            System.out.println("Harf Notunuz : DC");
        }
        else if(toplam >= 60)
        {
            System.out.println("Harf Notunuz : DD");
        }
        else if(toplam >= 55)
        {
            System.out.println("Harf Notunuz : FD");
        }
        else
        {
            System.out.println("Harf Notunuz : FF");
        }
        if(toplam < 65)
        {
            System.out.println("Harf Notunuz DD veya Daha dusuk bir degere sahip oldugu icin bu uyariyi gormektesiniz lutfen derslerinize calısın yoksa sınıfta kalacaksınız");
        }
        scan.close();
    }
    
}
