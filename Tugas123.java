import java.util.Scanner;

public class Tugas123 {

    private static final char[] KODE = {
        'A', 'B', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'M' 
    };

    private static final String[][] KOTA = {
        {"Aceh","Banda Aceh"},
        {"Bangka Belitung","Pangkalpinang"},
        {"Bengkulu","Bengkulu"},
        {"DI Yogyakarta","Yogyakarta"},
        {"DKI Jakarta","Jakarta"},
        {"Jawa Barat","Bandung"},
        {"Jawa Tengah","Semarang"},
        {"Jawa Timur","Surabaya"},
        {"Lampung","Bandar Lampung"},
        {"Maluku","Ambon"}
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Kode Plat Nomer: ");
        String kodePlat = scanner.nextLine().toUpperCase();

        int indexKota = -1;
        for (int i = 0; i < KODE.length; i++) {
            if(kodePlat.charAt(0) == KODE[i]) {
                indexKota = i;
                break;
            }
        }

            if (indexKota != -1) {
                System.out.println("Kota: " + KOTA[indexKota][1]);
            } else {
                System.out.println("Kode Plat Nomer Tidak Ditemukan!!");
            }
        }
    }    
