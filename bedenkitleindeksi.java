import java.util.Scanner;

public class bedenkitleindeksi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double boy;
        double kilo;
        double bki;

        System.out.println("Lutfen Kilonuzu Giriniz");
        kilo = scanner.nextDouble();
        System.out.println("Lutfen boyunuzu m cinsinden giriniz");
        boy = scanner.nextDouble();

        bki = kilo / (boy * boy) ;
        System.out.println("Beden Kitle indeksiniz = " + bki);
        
        if(bki < 20)
        {
            System.out.println("Zayıfsınız");
        }
        else if(bki > 20 && bki < 24.99)
        {
            System.out.println("Normalsiniz");
        }
        else if(bki > 25 && bki < 29.99)
        {
            System.out.println("Hafif Şişman");
        }
        else if(bki > 30 && bki < 34.99)
        {
            System.out.println("Şişman");
        }
        else if(bki > 35 && bki < 44.99)
        {
            System.out.println("Sağlık Açısından Önemli (Diyetisyen iyi bir tercih olabilir !)");
        }
        else if(bki > 45 && bki < 49.99)
        {
            System.out.println("Aşırı Şişman (Diyetisyene gözükmelisiniz !!)");
        }
        else 
        {
            System.out.println("Ölümcül Şişman (Kesinlikle diyetisyen gerekiyor !!!)");
        }
        

        scanner.close();

    }
    
}
