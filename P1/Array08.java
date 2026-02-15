package P1;

import java.util.Scanner;

public class Array08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Program Menghitung IP Semester ===");

        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlahMK = input.nextInt();
        input.nextLine(); // buang newline

        String[] namaMK = new String[jumlahMK];
        int[] sks = new int[jumlahMK];
        double[] nilaiAngka = new double[jumlahMK];
        String[] nilaiHuruf = new String[jumlahMK];
        double[] nilaiSetara = new double[jumlahMK];

        double totalMutu = 0;
        int totalSKS = 0;

        for (int i = 0; i < jumlahMK; i++) {
            System.out.println("\nData MK ke-" + (i + 1));
            System.out.print("Nama MK: ");
            namaMK[i] = input.nextLine();

            System.out.print("Bobot SKS: ");
            sks[i] = input.nextInt();

            System.out.print("Nilai Angka: ");
            nilaiAngka[i] = input.nextDouble();
            input.nextLine();

            if (nilaiAngka[i] > 80) {
                nilaiHuruf[i] = "A";
                nilaiSetara[i] = 4.0;
            } else if (nilaiAngka[i] > 73) {
                nilaiHuruf[i] = "B+";
                nilaiSetara[i] = 3.5;
            } else if (nilaiAngka[i] > 65) {
                nilaiHuruf[i] = "B";
                nilaiSetara[i] = 3.0;
            } else if (nilaiAngka[i] > 60) {
                nilaiHuruf[i] = "C+";
                nilaiSetara[i] = 2.5;
            } else if (nilaiAngka[i] > 50) {
                nilaiHuruf[i] = "C";
                nilaiSetara[i] = 2.0;
            } else if (nilaiAngka[i] > 39) {
                nilaiHuruf[i] = "D";
                nilaiSetara[i] = 1.0;
            } else {
                nilaiHuruf[i] = "E";
                nilaiSetara[i] = 0.0;
            }

            totalMutu += nilaiSetara[i] * sks[i];
            totalSKS += sks[i];
        }

        System.out.println("\n=== Hasil Konversi Nilai ===");
        System.out.printf("%-30s %-10s %-10s %-10s\n", "Mata Kuliah", "Angka", "Huruf", "Mutu");

        for (int i = 0; i < jumlahMK; i++) {
            System.out.printf("%-30s %-10.2f %-10s %-10.2f\n",
                    namaMK[i], nilaiAngka[i], nilaiHuruf[i], nilaiSetara[i]);
        }

        double IP = totalMutu / totalSKS;
        System.out.println("\nTotal SKS : " + totalSKS);
        System.out.printf("IP Semester = %.2f\n", IP);
    }
}
