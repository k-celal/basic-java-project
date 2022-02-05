import java.util.Scanner;


public class atmprogrami {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double bakiye = 0, miktar = 0;
        char islem = 0;

        do
        {
            System.out.println("Yapmak İstediginiz İslemi seciniz\n" + "1-)Bakiye Ogrenme 2-)Para Cekme 3-)Para Yatırma q-)Cikis ");
            islem = scan.next().charAt(0);
            switch (islem) 
            {
                case '1':
                    System.out.println("Bakiyeniz = " + bakiye);
                    break;
                case '2':
                    System.out.println("Bakiyeniz = " + bakiye);
                    System.out.println("Cekmek istediginiz miktari giriniz");
                    miktar = scan.nextDouble();
                    if(miktar <= bakiye)
                    {
                        bakiye -= miktar;
                        System.out.println("Cektikten sonraki yeni bakiyeniz = " + bakiye );

                    }
                    else
                    {
                        System.out.println("Bakiyeniz Yetersiz!!");
                    }
                    break;
                case '3':
                    System.out.println("Bakiyeniz = " + bakiye);
                    System.out.println("Yatırmak istediginiz miktari giriniz");
                    miktar = scan.nextDouble();
                    bakiye += miktar;
                    System.out.println("Yatırdıktan sonraki yeni bakiyeniz = " + bakiye );
                    break;
                case 'q':
                    System.out.println("Cıkıs yapılıyor!!...");
                    break;
                default:
                    System.out.println("Lutfen duzgun bir secim yapiniz");
                    break;
            }



        }while(islem != 'q');
        scan.close();
    }
}
