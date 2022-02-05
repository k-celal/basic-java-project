import java.util.Scanner;

public class dikucgenhipotenuz {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int kenar1,kenar2;
        double hipotenus;

        System.out.print("Lutfen dik kenarlardan ilkini giriniz : ");
        kenar1 = scan.nextInt();
        System.out.print("Lutfen dik kenarlardan ikincisini giriniz : ");
        kenar2 = scan.nextInt();

        hipotenus = Math.sqrt((kenar1 * kenar1) + (kenar2 * kenar2));

        System.out.println("Kenarları " + kenar1 + " , "+ kenar2 + " Olan ucgenin hipotenusu = " + hipotenus);
        scan.close();
    }

}
