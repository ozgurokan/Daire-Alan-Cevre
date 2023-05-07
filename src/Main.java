import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double pi = 3.14, r, cevre, alan;

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen Dairenin Yarı Çapını Giriniz : ");
        r = input.nextDouble();

        cevre = 2*(pi*r);
        alan = pi * r * r;

        System.out.println("Dairenin Çevresi : "+ cevre );
        System.out.println("Dairenin Alanı : "+ alan );


    }
}