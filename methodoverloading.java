public class methodoverloading {
    public static void skorhesap(String isim , int puan) {
        System.out.println(isim + " adlı oyuncunun " + puan + " puani var");    
        
    }
    public static void skorhesap(int puan) {
        System.out.println("isimsiz adlı oyuncunun " + puan + " puani var");    
        
    }
    public static void skorhesap(String isim) {
        System.out.println(isim + " adlı oyuncunun hic puani yok");    
        
    }
    public static void main(String[] args) {
        skorhesap("celal",1000);
        skorhesap(1500);
        skorhesap("celal");

        
    }
    
}
