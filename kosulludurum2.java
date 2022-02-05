import java.util.Scanner;



public class kosulludurum2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int islem;
        System.out.println("İslem giriniz");
        islem = scan.nextInt();
        if(islem == 1)
        {
            System.out.println("islem"+ islem + "secildi");
        }
        else if(islem == 2)
        {
            System.out.println("islem"+ islem + "secildi");

        }
        else if(islem == 3)
        {
            System.out.println("islem"+ islem + "secildi");

        }
        else if(islem == 4)
        {
            System.out.println("islem"+ islem + "secildi");

        }
        else
        {
            System.out.println("Lutfen 1 - 4 aralıgında islem seciniz");
        }
        scan.close();
    }
    
}
