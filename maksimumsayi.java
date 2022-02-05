import java.util.Scanner;

public class maksimumsayi {
    public static void main(String[] args) {
        int sayi1,sayi2,sayi3;
        Scanner in = new Scanner(System.in);
        System.out.print("İlk Sayiyi giriniz : ");
        sayi1 = in.nextInt();
        System.out.print("İkinci Sayiyi giriniz : ");
        sayi2 = in.nextInt();
        System.out.print("Üçüncü Sayiyi giriniz : ");
        sayi3 = in.nextInt();
        if(sayi1 >= sayi2 && sayi1 >= sayi3)
        {
            System.out.println("Girdiginiz sayilardan en büyüğü = " + sayi1);

        }
        else if(sayi2 >= sayi1 && sayi2 >= sayi3)
        {
            System.out.println("Girdiginiz sayilardan en büyüğü = " + sayi2);

        }
        else
        {
            System.out.println("Girdiginiz sayilardan en büyüğü = " + sayi3);
        }
        in.close();


    }   
}
