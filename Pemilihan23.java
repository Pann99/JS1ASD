import java.util.Scanner;

public class Pemilihan23 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println ("Program Menghitung Nilai Akhir");
        System.out.println ("=========================");
        System.out.print("Masukkan Nilai Tugas : ");
        double nilaiTugas = scanner.nextDouble();
        System.out.print("Masukkan Nilai Kuis  : ");
        double nilaiKuis = scanner.nextDouble();
        System.out.print("Masukkan Nilai UTS   : ");
        double nilaiUTS = scanner.nextDouble();
        System.out.print("Masukkan Nilai UAS   : ");
        double nilaiUAS = scanner.nextDouble();

        if (nilaiTugas < 0 || nilaiTugas > 100 ||
            nilaiKuis < 0  || nilaiKuis > 100  ||
            nilaiUTS < 0   || nilaiUTS > 100   ||
            nilaiUAS < 0   || nilaiUAS > 100) {
            System.out.println("Nilai Tidak Valid");
            return;
        }

        double nilaiAkhir = (0.2 * nilaiTugas) + (0.2 * nilaiKuis) + (0.2 * nilaiUTS) + (0.2 * nilaiUAS);
        
        String nilaiHuruf;
        if (nilaiAkhir >= 80) {
            nilaiHuruf = "A";
        } else if (nilaiAkhir >= 73) {
            nilaiHuruf = "B+";
        } else if (nilaiAkhir >= 65) {
            nilaiHuruf = "B"; 
        }  else if (nilaiAkhir >= 60) {
            nilaiHuruf = "C+";
        } else if (nilaiAkhir >= 50) {
            nilaiHuruf = "C"; 
        }  else if (nilaiAkhir >= 39) {
            nilaiHuruf = "D";  
        }  else {
            nilaiHuruf = "E";
        }

        String keterangan;
        if (nilaiHuruf.equals("A") || nilaiHuruf.equals("B+") || nilaiHuruf.equals("B") ||
            nilaiHuruf.equals("C+") || nilaiHuruf.equals("C")) {
            keterangan = "SELAMAT ANDA LULUS";
        } else {
            keterangan = "MAAF ANDA TIDAK LULUS";
        }

        System.out.println ("=========================");
        System.out.println ("=========================");
        System.out.println ("Nilai Akhir : " + nilaiAkhir);
        System.out.println ("Nilai Huruf : " + nilaiHuruf);
        System.out.println ("=========================");
        System.out.println ("=========================");
        System.out.println ("" + keterangan);
    }

}

