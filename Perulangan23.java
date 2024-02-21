import java.util.Scanner;

public class Perulangan23 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan Nim : ");
        double nim = scanner.nextDouble();
        System.out.println ("=========================");

        double n = nim % 100;

        if (n < 10) {
            n += 10;
        }

        for (int i = 1; i <= n; i++) {
            if (i == 6 ||i == 10) {
                continue;
            } else if (i % 2 == 0) {
                System.out.print(i + " ");
            } else {
                System.err.print(" *");
            }
        }
        System.out.println();

    }
}