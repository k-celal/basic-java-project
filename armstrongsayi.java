import java.util.Scanner;


public class armstrongsayi 
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int toplam = 0,basamak_sayi,sayi;

        System.out.println("Armstorng olup olmadigini kontrol etmek istediginiz sayiyi giriniz");
        sayi = scan.nextInt();
        System.out.println("Girdiginiz sayinin basamak sayisini giriniz");
        basamak_sayi = scan.nextInt();
        int gecici = sayi;
        do
        {
            int basamak_degeri = sayi % 10;
            sayi /= 10;
            toplam += Math.pow(basamak_degeri, basamak_sayi);
        }while(sayi > 0);
        if(gecici  == toplam)
        {
        System.out.println(gecici + " sayisi bir armstorng sayidir");
        }
        else
        {
            System.out.println(gecici + " sayisi bir armstorng sayi degildir");
        }
        scan.close();
    }   
}
