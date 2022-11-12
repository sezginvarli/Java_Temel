public class Baslangic {

    public static void main(String[] args) {
        //yorum satırımız
        System.out.println("Hello World ! \"Good morning\"");
        System.out.println("Let's start");

        int numberOne = 10, numberTwo = 13, numberThree;
        numberOne = 8;
        numberThree = numberOne + numberTwo;
        System.out.println(numberThree);


        //dikdörtgen alan ve cevre hesaplama
        int kisakenar = 10, uzunKenar = 20;
        int alan = kisakenar * uzunKenar;
        int cevre= 2*(kisakenar+uzunKenar);
        System.out.println(alan);
        System.out.println(cevre);

        byte vByte=100;
        short vshort=1000;
        int vInt=10000;
        long vLong=1000000000;
        System.out.println(vByte);
        System.out.println(vshort);
        System.out.println(vInt);
        System.out.println(vLong);

        float vFloat=3.14f;
        System.out.println(vFloat);
        double vDouble= 118.800;
        System.out.println(vDouble);

        char vChar='b';
        char vCharTwo=98;
        System.out.println(vChar);
        System.out.println(vCharTwo);

        char c1='J';
        char c2='A';
        char c3='V';
        char c4='A';
        System.out.println(""+c1+c2+c3+c4);

        boolean dogru=true;
        boolean yanlis=false;
        System.out.println(dogru);
        System.out.println(yanlis);
    }
}
