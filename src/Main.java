import java.util.Scanner;


public class Main {
    static boolean asalSayi(int sayi, int i) {
        if (i == 1) {
            return true;
        } else {
            if (sayi % i == 0) {
                return false;
            } else {
                return asalSayi(sayi, i - 1);
            }
        }
    }


    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Bir sayı girin: ");
        int sayi = inp.nextInt();

        if (sayi <= 1) {
            System.out.println(sayi + " Asal bir sayı değildir.");
        } else {
            if (asalSayi(sayi, sayi / 2)) {
                System.out.println(sayi + " Asal bir sayıdır.");
            } else {
                System.out.println(sayi + " Asal bir sayı değildir.");
            }
        }


    }
}