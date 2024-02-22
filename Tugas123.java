import java.util.Scanner;

public class Tugas123 {

    private static final char[] KODE = {
        'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T' 
    };

    private static final String[][] KOTA = {
        {"BANTEN"},
        {"JAKARTA"},
        {"BANDUNG"},
        {"CIREBON"},
        {"BOGOR"},
        {"PEKALONGAN"},
        {"SEMARANG"},
        {"SURABAYA"},
        {"MALANG"},
        {"TEGAL"}
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Kode Plat Nomer: ");
        String kodePlat = scanner.nextLine().toUpperCase();

        char kodeDepan = kodePlat.charAt(0);
        int indexKota = -1;
        for (int i = 0; i < KODE.length; i++) {
            if (kodeDepan == KODE[i]) {
                indexKota = i;
                break;
            }
        }

        if (indexKota != -1) {
            System.out.println("Kota: " + KOTA[indexKota][0]);
        } else {
            System.out.println("Kode Plat Nomer Tidak Ditemukan!!");
        }
    }
}
