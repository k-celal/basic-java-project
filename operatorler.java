public class operatorler {
    public static void main(String[] args) {
        System.out.println(3 + 4);
        System.out.println(5 * 8);
        System.out.println(6 - 9);
        System.out.println(10 / 9); // bolmeyi yapar ve küçüğe yuvarlar
        System.out.println(10d / 9); // 10d double olduğunu belirtir ve sonuç double çıkar 10f de olabilir
        System.out.println(10 / 9.0); // 10d yerine 10.0 da kullanılabilir değeri double yapar
        System.out.println(10 % 4); // kalan operatorü

        int a = 2;
        System.out.println(a);
        a = a + 2; // a+=2 de kullanılabilir
        a++; // a yı 1 artırır
        int b = 2;
        System.out.println(b);
        b = b - 2; // b-=2 de kullanılabilir
        b--; // b yi 1 azaltır
        // --------------------------------------------------------- //
        int c = 7 ;
        System.out.println(c--); // önce c yi oku sonraa değerini azalt 
        int d = 8;
        System.out.println(--d); // önce değerini azalt sonra oku
    }

}
