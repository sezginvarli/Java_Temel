public class Operators {
    public static void main(String[] args) {
        int a = 5, b = 2 , c=5;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);

        // b=b+a;
        b += a;
        b -= a;
        b *= a;
        b /= a;
        System.out.println(b);

        boolean sonuc = (a == b);
        System.out.println(sonuc);
        // == eşittir
        // != eşit değildir
        // > büyüktür
        // < küçüktür
        // >= büyük eşit
        // <= küçük eşit

        // && VE
        // || VEYA
        // ! değildir

        boolean kosul1= a==c;
        boolean kosul2= a>=b;
        boolean sonuc2= kosul1&&kosul2;
        System.out.println(sonuc2);

        String str= sonuc2 ? "Doğru" : "Değil";
        System.out.println(str);
    }
}