import java.util.Scanner;

public class metodlar {
    public static int ikilecarp(int a) {
        return a*2;
        
    }
    public static void faktoriyel() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Lutfen faktoriyelini almak istediginiz sayiyi giriniz");
        int a = sc.nextInt();
        int fak = 1;

        for (int i = a; i > 0; i--) {

            fak = i * fak;
            
        }
        System.out.println(fak);
        sc.close();
        
    }
    public static void toplama(int a, int b , int c) {
        System.out.println("Girdiginiz sayilarin toplami = " + (a+b+c));
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Paramatreler****************************
        System.out.println("Toplamak istediginiz sayilari giriniz");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        toplama(a, b, c);
        //faktoriyel();
        //return kullanimi*************************
        System.out.println("2 ile carpmak istediginiz sayiyi giriniz");
        int d = sc.nextInt();
        
        System.out.println(ikilecarp(d));
        sc.close();


        
    }
    
}
