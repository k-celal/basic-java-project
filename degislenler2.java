public class degislenler2 {
    public static void main(String[] args) {
         //char karakter boolean sadece true ve false tutar

        char a = 'b';
        char b = '\u00AE'; // \u00AE ile unicode ekleyebiliriz 
        char c = 2000;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        boolean d = true;
        boolean e = false;
        System.out.println(d ? "evet" : "hayır");
        System.out.println(e ? "evet" : "hayır");
        String f = "Merhaba"; // \t ve \n burda da var 
        String g = "Dünya";
        System.out.println(f+g);
    }
}
