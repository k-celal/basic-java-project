import java.util.Scanner;

public class switchcaseyapi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int secim;
        System.out.println("yapmak istediginiz islemi seciniz 1 - 4 aralık");
        secim = scan.nextInt();
        switch (secim) {
            case 1:
                System.out.println("Secim = " + secim + " dir");
                break;
            case 2:
                System.out.println("Secim = " + secim + " dir");
                break;
            case 3:
                System.out.println("Secim = " + secim + " dir");
                break;
            case 4:
                System.out.println("Secim = " + secim + " dir");
                break;
            default:
                System.out.println("Lutfen Dogru secim yapiniz");
                break;
        }
        scan.close();
    }
    
    

    
}
