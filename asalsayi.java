public class asalsayi {
    public static boolean asalmi(int a) {
        for (int i = 2; i < a; i++) {

            if(a % i == 0)
            {
                return false;
            }
            
        }
        return true;
        
        
    }
    public static void main(String[] args) {
        
        for (int i = 2; i < 1000; i++) {
            if(asalmi(i) == true)
            {
                System.out.println(i + " sayisi asaldir");
            }

            
        }
    
    }
    
}
