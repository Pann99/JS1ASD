import java.util.Scanner;

public class Tugas223 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("\n=============================");
            System.out.println("Pilihan Menu");
            System.out.println("=============================");
            System.out.println("1. Hitung Kecepatan");
            System.out.println("2. Hitung Jarak");
            System.out.println("3. Hitung Waktu");
            System.out.println("4. Keluar");
            System.out.println("=============================");
            System.out.print("Pilihlah Menu 1/2/3/4: ");
            int pilihan = input.nextInt();
            
            switch (pilihan) {
                case 1:
                    hitungKecepatan();
                    break;
                case 2:
                    hitungJarak();
                    break;
                case 3:
                    hitungWaktu();
                    break;
                case 4:
                    System.out.println("=============================");
                    System.out.println("Terima Kasih!! Program Selesai.");
                    System.exit(0);
                default:
                    System.out.println("=============================");
                    System.out.println("Pilihan Tidak Valid. Silahkan Pilih Lagi");
                   
            }
        }
    }

    public static void hitungKecepatan() {
        Scanner input = new Scanner(System.in);

        System.out.println("=============================");
        System.out.print("Masukkan Jarak (s): ");
        double jarak = input.nextDouble();
        System.out.print("Masukkan Waktu (t): ");
        double waktu = input.nextDouble();

        double kecepatan = jarak / waktu;
        
        System.out.println("Kecepatan (v) = " + kecepatan);
    }
    
    public static void hitungJarak() {
        Scanner input = new Scanner(System.in);

        System.out.println("=============================");
        System.out.print("Masukkan Kecepatan (v): ");
        double kecepatan = input.nextDouble();
        System.out.print("Masukkan Waktu (t): ");
        double waktu = input.nextDouble();

        double jarak = kecepatan * waktu;

        System.out.println("Jarak (s) = " + jarak);
    }

    public static void hitungWaktu() {
        Scanner input = new Scanner(System.in);

        System.out.println("=============================");
        System.out.print("Masukkan Jarak (s): ");
        double jarak = input.nextDouble();
        System.out.print("Masukkan Kecepatan (v): ");
        double kecepatan = input.nextDouble();

        double waktu = jarak / kecepatan;

        System.out.println("Waktu (t) = " + waktu);
    }
}