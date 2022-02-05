import java.util.Scanner;


public class kullanicigiris {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String default_kullanici_adi = "Celal Karahan",default_kullanici_sifre = "celal1234",kullanici_adi,kullanici_sifre;
        int islem=0 ,girissayi = 0;

        do
        {
            System.out.println("Lutfen Kullanici adinizi giriniz");
            kullanici_adi = scan.nextLine();
            if(default_kullanici_adi.equals(kullanici_adi))
            {
                girissayi=0;
                do
                {
                    System.out.println("Lutfen Sifrenizi giriniz");
                    kullanici_sifre = scan.nextLine();

                    if(default_kullanici_sifre.equals(kullanici_sifre))
                    {
                        System.out.println("Giris Basarili...");
                        islem = 1;
                    }
                    else
                    {
                        girissayi++;
                        if(girissayi == 3)
                        {
                            System.out.println("Yanlis Cok fazla deneme yaptiniz kullanici adi sayfasina yönlendiriliyor...");
                            break;
                        }
                        System.out.println("Sifreniz Yanlis Lutfen kontrol ediniz");

                    }
                }while(islem != 1);
                

            }
            else
            {
                girissayi++;
                if(girissayi == 3)
                {
                    System.out.println("Yanlis Cok fazla deneme yaptiniz kapatiliyor...");
                    break;
                }
                System.out.println("Lutfen Kullanici adinizi kontrol ediniz");

            }
        }while(islem != 1);
        scan.close();
    }
    
}
