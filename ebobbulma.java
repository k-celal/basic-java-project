import java.util.Scanner;

public class ebobbulma {
    public static int ebob(int a, int b) {
        int ebob = 1;

        for (int i = 1; i <= a && i <= b; i++) {
            
            if(a % i == 0 && b%i == 0)
            {
            ebob = i;
            }
            
        }
        return ebob;
        
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Lutfen ebobunu almak istediginiz sayilari giriniz");
        int a = sc.nextInt();
        int b =sc.nextInt();

        System.out.println(a +","+ b +" nin ebobu "+ ebob(a, b) );
        sc.close();
        
    }
    
}
