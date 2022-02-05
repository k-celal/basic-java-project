import java.util.Scanner;

public class fordongu {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = 0;
        /*for( ; i<5 ; i++)
        {
            System.out.println(i);  
        }*/
        //faktöriyel
        System.out.println("Hangi sayının faktoriyelini almak istiyosunuz");
        int a = scan.nextInt();
        int fak = 1 ;
        for(i  = a ; i>0 ; i--)
        {
            fak = fak*i;
            scan.close();
        }   
        System.out.println(a +" sayısının faktoriyeli = " + fak);
        scan.close();
    }
    
}
