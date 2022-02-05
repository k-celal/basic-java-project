import java.util.Scanner;

public class kmdekacyakar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        double kacyakar;
        double kackm;
        double tutar;

        System.out.print("Aracınız 1 km de kac tl yakar : ");
        kacyakar = scan.nextDouble();
        System.out.print("Aracınızla kac km gittiniz : ");
        kackm = scan.nextDouble();
        tutar = kacyakar*kackm;

        System.out.println("Ödenecek tutar = " + tutar);


        scan.close();

    }
    
}
