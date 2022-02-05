import java.util.Scanner;

public class kosulludurum1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int yas;

        System.out.println("Lutfen yasinizi giriniz");
        yas = in.nextInt();
        if (yas >= 18) {
            System.out.println("Girebilirsiniz");
        } else {
            System.out.println("Giremezssiniz");
        }
        in.close();

    }

}
