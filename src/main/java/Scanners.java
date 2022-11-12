import java.util.Scanner;

public class Scanners {
    public static void main(String[] args) {
        int a;
        System.out.println("Enter an integer");
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        System.out.println(a);

        System.out.print("Değer giriniz: ");
        Scanner input1= new Scanner(System.in);
        double b = input1.nextDouble();
        System.out.println(b);

    }
}
