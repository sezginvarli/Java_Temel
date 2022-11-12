package Pratics;

import java.util.Scanner;

public class _01_Not_Ortalaması_Hesaplama {
    public static void main(String[] args) {
        // Variables oluştur
        int mat, fizik, kimya, turkce, tarih, muzik;

        //Scanner sınıfımızı tanımladık
        Scanner input = new Scanner(System.in);

        //Kullanıcıdan değerleri al
        System.out.print("Matematik Notunuz : ");
        mat = input.nextInt();

        System.out.print("Fizik Notunuz : ");
        fizik = input.nextInt();

        System.out.print("Kimya Notunuz : ");
        kimya = input.nextInt();

        System.out.print("Türkçe Notunuz : ");
        turkce = input.nextInt();

        System.out.print("Tarih Notunuz : ");
        tarih = input.nextInt();

        System.out.print("Müzik Notunuz : ");
        muzik = input.nextInt();

        int toplam = (mat + fizik + kimya + turkce + tarih + muzik);

        double sonuc = toplam / 6.0;
        int gecmeNotu = 60;

        System.out.println("Ortalamanız : " + sonuc);

        String str = sonuc >= gecmeNotu ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println(str);
    }
}
