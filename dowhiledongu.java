import java.util.Scanner;

public class dowhiledongu {
    public static void main(String[] args) {
        //int i = 0;
        Scanner scaan = new Scanner(System.in);
        /*
         * do
         * {
         * System.out.println(i);
         * i++;
         * }while(i<5);
         */
        System.out.println("Hangi sayının rakamlrı toplamını bulmak istiyosunuz");
        int sayi = scaan.nextInt();
        int b = 0;
        do {
            b = b + sayi % 10;
            sayi /= 10;
        } while (sayi > 0);
        System.out.println("Rakamlar toplamı = " + b);
        scaan.close();
    }

}
