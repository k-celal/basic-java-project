import java.util.Scanner;

public class faizhesaplama {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double faiz_oran = 0.6;
        int ana_para , vade ;

        System.out.println("Anapara'nızı giriniz");
        ana_para = sc.nextInt();
        System.out.println("Kac yıl vadeli yatırmak istiyorsunuz");
        vade = sc.nextInt();

        double toplampara = ana_para;

        for (int i = 1; i < vade; i++) 
        {
            toplampara = (toplampara * faiz_oran) + toplampara; 
            System.out.println(i + "Yilin sonunda para = " + toplampara);  
        }
        
        sc.close();

    }
    
}
