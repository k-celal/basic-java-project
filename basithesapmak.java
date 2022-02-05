import java.util.Scanner;

public class basithesapmak {
    public static void main(String[] args) {
        double s1,s2;
        int islem;
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen islem yapmak istediginiz ilk sayiyi giriniz");
        s1 = scan.nextDouble();
        System.out.println("Lutfen islem yapmak istediginiz ikinci sayiyi giriniz");
        s2 = scan.nextDouble();
        System.out.println("Yapmak istediginiz islemi seciniz 1-)Toplama 2-)Çıkarma 3-)Carpma 4-)Bölme");
        islem = scan.nextInt();

    switch (islem) {
        case 1:
            System.out.println("İsleminizin Sonucu = " + (s1+s2));
            break;
        case 2:
            System.out.println("İsleminizin Sonucu = " + (s1-s2));
            break;
        case 3:
            System.out.println("İsleminizin Sonucu = " + (s1*s2));
            break;
        case 4:
            System.out.println("İsleminizin Sonucu = " + (s1/s2));
            break;
        default:
            System.out.println("1 - 4 aralıgında secim yapiniz");
            break;

    }
    scan.close();
    }
    
}
