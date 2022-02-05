import java.util.Scanner;

public class whiledongu {
    public static void main(String[] args) {
        int i = 0 ; 
        /*while(i<10)
        {
            System.out.println(i);
            i++;
        }*/
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen faktoriyelini almak istediginiz sayiyi giriniz");
        i = scan.nextInt();
        int fak = 1;
        while(i>0)
        {
            fak *= i;
            i--;
        }
        System.out.println("Faktoriyelin sonucu = " + fak);
        scan.close();
    }
    
}
