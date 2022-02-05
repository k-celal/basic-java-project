public class degiskenler {
    public static void main(String[] args) {
        int a = 4; //4 Byte
        System.out.println("Deger = " + a);
        a = 4 + 6;
        System.out.println("Yeni deger = " + a + " İslem Tamamlandi"); //System out println içine + kullanarak birden çok deger yazabiliriz 
        //-------------------------------------------------------------------------\\
        int b = 5;
        System.out.println(b);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        byte c = 10;
        System.out.println(c);
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);
        Short d = 10;
        System.out.println(d);
        System.out.println(Short.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);
        long e = 10;
        System.out.println(e);
        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);
        double aa = 10.89954;
        System.out.println(aa);
        System.out.println(Double.MAX_VALUE);
        System.out.println(Double.MIN_VALUE);
        float ab = (float)1.8; // dönüştürme lazım // float ab = 1.8f şeklinde de kullanılır
        System.out.println(ab);
        System.out.println(Float.MAX_VALUE);
        System.out.println(Float.MIN_VALUE);

        //Dönüştürme---------------------------------------\\
        int f = 5;
        byte g = (byte)a; //dönüştürme işlemi böyle yapılır
        System.out.println(f);
        System.out.println(g);


    }
}
