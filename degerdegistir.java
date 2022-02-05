import java.util.Scanner;

public class degerdegistir {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int birincisayi;
        int ikincisayi;

        System.out.println("Birinci sayiyi giriniz");
        birincisayi = scan.nextInt();
        System.out.println("İkinci sayiyi giriniz");
        ikincisayi = scan.nextInt();

        System.out.println("Birinci sayi : " + birincisayi + "ikinci sayi : " + ikincisayi);

        int temp = birincisayi;
        birincisayi = ikincisayi ; 
        ikincisayi = temp ; 

        System.out.println("Degismeden sonraki \n" +" Birinci sayi : " + birincisayi + " ikinci sayi : " + ikincisayi);
        scan.close();
    }
    
}
