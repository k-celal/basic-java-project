import java.util.Scanner;

public class scanleinputislemi {
    public static void main(String[] args) {
        int yas;
        Double kilo;
        String isim;

        Scanner scanner = new Scanner(System.in); //Scanner scanner = new Scanner(System.in); [2.yazdığımız scanner addır istediğimiz şekilde değişebiliriz]
        System.out.println("Lutfen isminizi giriniz..."); //nextint den sonra nextline almaya çalışınca string değeri almaz bunun için sahte nextline oluşturmaktır
        isim = scanner.nextLine();
        System.out.println("Lutfen yasinizi giriniz...");

        if (scanner.hasNextInt()) {
            yas = scanner.nextInt();
            System.out.println("Yasiniz = " + yas);

        } else {
            System.out.println("Lutfen sayi degeri giriniz");

        }       
        System.out.println("Lutfen kilounuzu giriniz...");
        kilo = scanner.nextDouble();

        System.out.println("İsminiz = " + isim);
        System.out.println("kilounuz = " + kilo);
        scanner.close(); // scanner kapatır

    }

}
