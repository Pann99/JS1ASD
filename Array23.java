import java.util.Scanner;
public class Array23 {
    
    public static void main (String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);

        int jumlahMataKuliah;
        String [] namaMataKuliah;
        int [] bobotSKS;
        String [] nilaiHuruf;
        double [] nilaiAngka;
        double totalNilai = 0;
        double totalSKS = 0;

        System.out.println("=============================");
        System.out.println("Program Mengitung IP Semester");
        System.out.println("=============================");

        System.out.print("Masukkan jumlah MataKuliah: ");
        jumlahMataKuliah = scanner1.nextInt();

        namaMataKuliah = new String[jumlahMataKuliah];
        bobotSKS = new int[jumlahMataKuliah];
        nilaiHuruf = new String[jumlahMataKuliah];
        nilaiAngka = new double[jumlahMataKuliah];

        for (int i = 0; i < jumlahMataKuliah; i++) {
            System.out.printf("MataKuliah ke-%d:\n", i + 1);
            System.out.print("Nama MataKuliah : ");
            namaMataKuliah[i] = scanner2.nextLine();
            System.out.print("Bobot SKS       : ");
            bobotSKS[i] = scanner1.nextInt();
            System.out.print("Nilai Huruf     : ");
            nilaiHuruf[i] = scanner1.next();

            switch (nilaiHuruf[i]) {
                case "A":
                    nilaiAngka[i] = 4.0;
                    break;
                case "AB":
                    nilaiAngka[i] = 3.5;
                    break;
                case "B":
                    nilaiAngka[i] = 3.0;
                    break;
                case "BC":
                    nilaiAngka[i] = 2.5;
                    break;
                case "C":
                    nilaiAngka[i] = 2.0;
                    break;
                case "D":
                    nilaiAngka[i] = 1.0;
                    break;
                default:
                    nilaiAngka[i] = 0.0;
            }
            
            totalNilai += nilaiAngka[i] * bobotSKS[i];
            totalSKS += bobotSKS[i];
        }
        
        double ipSemester = totalNilai / totalSKS;

        System.out.println("=============================");
        System.out.println("Hasil Konversi Nilai");
        System.out.println("=============================");
        System.out.printf("Total SKS   : %.2f\n", totalSKS);
        System.out.printf("IP Semester : %.2f\n", ipSemester);
    }
}
