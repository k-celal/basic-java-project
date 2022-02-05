import java.util.Scanner;

public class gelismishesapmak {
    public static int cıkarma(int a,int b) {
        return (a-b);
        
    }
    public static int toplama(int a,int b) {
        return (a+b);
        
    }
    public static int toplama(int a,int b,int c) {
        return (a+b+c);
        
    }
    public static int carpma(int a,int b,int c) {
        return (a * b* c);
        
    }
    public static int caprma(int a,int b) {

        return (a* b);
        
    }
    public static double bolme(int a,int b) {
        return ((double)a/b);
        
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int s1,s2,s3;
        System.out.println("Yapmak istediginiz islemi seciniz 1-)2'li Toplama 2-)Çıkarma 3-)2'li Carpma 4-)Bölme 5-)3'lu Toplama 6-)3'lu Carpma");

        int islem = scan.nextInt();

        switch (islem) {
            case 1:
            System.out.println("Lutfen islem yapmak istediginiz ilk sayiyi giriniz");
            s1 = scan.nextInt();
            System.out.println("Lutfen islem yapmak istediginiz ikinci sayiyi giriniz");
            s2 = scan.nextInt();
            System.out.println("isleminizin sonucu  = " + toplama(s1, s2));

                break;
            case 2:
            System.out.println("Lutfen islem yapmak istediginiz ilk sayiyi giriniz");
            s1 = scan.nextInt();
            System.out.println("Lutfen islem yapmak istediginiz ikinci sayiyi giriniz");
            s2 = scan.nextInt();
            System.out.println("isleminizin sonucu  = " + cıkarma(s1, s2));
                break;
            case 3:
            System.out.println("Lutfen islem yapmak istediginiz ilk sayiyi giriniz");
            s1 = scan.nextInt();
            System.out.println("Lutfen islem yapmak istediginiz ikinci sayiyi giriniz");
            s2 = scan.nextInt();
            System.out.println("isleminizin sonucu  = " + caprma(s1, s2));
                break;
            case 4:
            System.out.println("Lutfen islem yapmak istediginiz ilk sayiyi giriniz");
            s1 = scan.nextInt();
            System.out.println("Lutfen islem yapmak istediginiz ikinci sayiyi giriniz");
            s2 = scan.nextInt();
            System.out.println("isleminizin sonucu  = " + bolme(s1, s2));
                break;
            case 5:
            System.out.println("Lutfen islem yapmak istediginiz ilk sayiyi giriniz");
            s1 = scan.nextInt();
            System.out.println("Lutfen islem yapmak istediginiz ikinci sayiyi giriniz");
            s2 = scan.nextInt();
            System.out.println("Lutfen islem yapmak istediginiz ucuncu sayiyi giriniz");
            s3 = scan.nextInt();
            System.out.println("isleminizin sonucu  = " + toplama(s1, s2,s3));
                break;
            case 6:
            System.out.println("Lutfen islem yapmak istediginiz ilk sayiyi giriniz");
            s1 = scan.nextInt();
            System.out.println("Lutfen islem yapmak istediginiz ikinci sayiyi giriniz");
            s2 = scan.nextInt();
            System.out.println("Lutfen islem yapmak istediginiz ucuncu sayiyi giriniz");
            s3 = scan.nextInt();
            System.out.println("isleminizin sonucu  = " + carpma(s1, s2,s3));
                break;
            default:
                System.out.println("Lutfen dogru bir secim yapiniz");
                break;
        }
        scan.close();
        
    }
    
}
